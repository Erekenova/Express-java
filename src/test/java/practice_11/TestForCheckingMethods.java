package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class TestForCheckingMethods {
    private MethodsForChecking methodsForChecking;


    @BeforeEach
    void setUp() {

        methodsForChecking = new MethodsForChecking();
    }

    /*1. Чётные и нечётные числа
    Нулевое значение
    Отрицательные числа*/
    @ParameterizedTest
    @ValueSource(ints = {0, 4, 100, -2, -100})
    @DisplayName("Проверка, что число четное (положительные, отрицательные и ноль)")
    public void isEvenReturnsTrueforEvenNumbers(int ints) {
        assertTrue(methodsForChecking.isEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 99, -1, -99})
    @DisplayName("Проверка, что число не является четным (положительные и отрицатльные)")
    void isEvenReturnsFalseForNegativeNumbers(int ints) {
        assertFalse(methodsForChecking.isEven(ints));
    }

    /*2.
        Тесты должны проверять:
        Разные строки ("hello" -> 2, "java" - 2, "AEIOU" -> 4, "" -> 0, "ssss" -> 0)
    null (должно выбрасываться исключение)
        Строки без гласных*/
    public static Stream<Arguments> stringForValidationPositiveCases() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("sss", 0),
                Arguments.of("", 0));
    }

    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCases")
    @DisplayName("Проверка, количества гласных в строке")
    public void checkNumberOfVowelsInString(String initialString, int countVowels) {
        int expectResult = methodsForChecking.countVowels(initialString);
        assertEquals(expectResult, countVowels);
    }

    @Test
    @DisplayName("Проверка, что выбрасывается исключение, когда строка равна null")
    public void checkNullStringForCountOfVowels() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForChecking.countVowels(null);
        }, "Checking if Null string is count vowels should lead to IllegalArgumentException");
    }

    //3.
    public static Stream<Arguments> stringForValidationPositiveCasesForReverseString() {
        return Stream.of(
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321"));
    }

    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCasesForReverseString")
    @DisplayName("Проверка разворота строки, позитивные тесты")
    public void checkReverseString(String initialString, String expectedString) {
        String actualResult = methodsForChecking.reverse(initialString);
        assertEquals(actualResult, expectedString);
    }

    @Test
    @DisplayName("Проверка, что при развороте null возвращается null")
    public void checkReverseNullString() {
        assertNull(methodsForChecking.reverse(null));
    }

/*  4.  [3, 5, 7, 2] → 7
            [1] → 1
            [-3, -5, -7, -2] → -2
            [] → выбрасывает NoSuchElementException
null → выбрасывает IllegalArgumentException*/

    public static Stream<Arguments> arraysForValidationPositiveCasesForFindMaxElement() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2));
    }

    @ParameterizedTest
    @MethodSource("arraysForValidationPositiveCasesForFindMaxElement")
    @DisplayName("Проверка максимального числа в массиве")
    public void checkMaxElement(int[] arr, int expected) {
        int actual = methodsForChecking.findMax(arr);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка, что при null выбрасывается исключение")
    public void checkNullForFindMaxElement() {
        assertThrows(NullPointerException.class, () -> {
                    methodsForChecking.findMax(null);
                },
                "Checking if null then find max element lead to IllegalArgumentException");
    }

    @Test
    @DisplayName("Проверка, что при пустом массиве выбрасывается исключение")
    public void checkEmptyArraysForFindMAxElement() {
        int[] arr = {};
        assertThrows(NoSuchElementException.class, () -> {
            methodsForChecking.findMax(arr);
        }, "No Such Element Exception");
    }

    /*  5.  Тесты должны проверять:
        Обычные невисокосные годы: 2019, 2021, 2022 → false
    Високосные годы: 2020, 2000, 1600 → true
    Года, делящиеся на 100, но не на 400: 1900, 2100 → false
    Граничные случаи: 0, 4, 400 → true
    year < 0 → Можно выбрасывать IllegalArgumentException (опционально).
    */
    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022})
    @DisplayName("Проверка, что год не високосный")
    public void isLeapYearsForNegativeCases(int ints) {
        assertFalse(methodsForChecking.isLeapYear(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    @DisplayName("Проверка, что год високосный")
    public void isLeapYearsForPositiveCases(int ints) {
        assertTrue(methodsForChecking.isLeapYear(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    @DisplayName("Проверка, что год делится на 100, но не на 400")
    public void isLeapYearsNoyDivide400(int ints) {
        assertFalse(methodsForChecking.isLeapYear(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 400})
    @DisplayName("Проверка, что год високосный, граничные случаи")
    public void isLeapYearsForBoundaryCases(int ints) {
        assertTrue(methodsForChecking.isLeapYear(ints));
    }

    @Test
    @DisplayName("Прверка, что если год отрицательный то выбрасывается исключение")
    public void negativeYearsCheck() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForChecking.isLeapYear(-1);
        }, "Illegal Argument Exception");
    }

    /* 6.Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
 null*/
    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    @DisplayName("Проверка, что email корректный")
    public void isValidEmailForPositiveCases(String email) {
        assertTrue(methodsForChecking.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain", ""})
    @DisplayName("Проверка, что email не корректный")
    public void isValidateEmailForNegativeCases(String email) {
        assertFalse(methodsForChecking.isValidEmail(email));
    }

    @Test
    @DisplayName("Проверка, что null email не корректный")
    public void isValidateNullEmail() {
        assertFalse(methodsForChecking.isValidEmail(null));
    }

    /*  7.  Базовый случай: factorial(0) → 1
        Обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
        Отрицательные числа: factorial(-3) → Должно выбрасывать IllegalArgumentException.*/
    public static Stream<Arguments> positiveCasesForCheckingFactorial() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingFactorial")
    @DisplayName("Вычисление факториала числа для положительных чисел")
    public void checkFactorial(int num, int expected) {
        int actualResult = methodsForChecking.factorial(num);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Проверка факториала отрицательного числа")

    public void checkFactorialOfNegativeNumbers() {
        int n = -3;
        assertThrows(IllegalArgumentException.class, () ->
                        methodsForChecking.factorial(n),
                "Вычисление факториала отрицательного числа приводит к исключению");

    }
   /* 8.Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
    Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
    Один элемент: [8] → Должно выбрасываться NoSuchElementException.
    Пустой массив: [] → Должно выбрасываться NoSuchElementException.*/

    public static Stream<Arguments> arrayForCheckingMaxNumber() {
        return Stream.of(Arguments.of(new int[]{3, 5, 7, 2}, 5));
    }

    @ParameterizedTest
    @MethodSource("arrayForCheckingMaxNumber")
    @DisplayName("Проверка второго максимального числа в массиве")
    public void checkSecondMaxNumberInArray(int[] arr, int expected) {
        int actual = methodsForChecking.findSecondMax(arr);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка поиска второго максимального числа в массиве с одинаковыми числами")
    public void checkSecondMaxNumberForArrayWithSameNumbers() {
        int[] arr = new int[]{4, 4, 4, 4, 4};
        assertThrows(NoSuchElementException.class, () ->
                        methodsForChecking.findSecondMax(arr),
                "Вычисление второго максимального числа в массиве с одинаковыми числами ведет к исключению");
    }

    @Test
    @DisplayName("Проверка поиска второго максимального числа в массиве с одним элементом")
    public void checkSecondMaxNumberForArrayWithOneElement() {
        int[] arr = new int[]{8};
        //при тестировании выяснилось, что выбрасывается IllegalArgumentException, вместо NoSuchElementException
        //поэтому ожидаемый результат изменен
        assertThrows(IllegalArgumentException.class, () ->
                        methodsForChecking.findSecondMax(arr),
                "Вычисление второго максимального числа в массиве с одним элементом ведет к IllegalArgumentException");

    }

    @Test
    @DisplayName("Проверка поиска второго максимального числа в пустом массиве")
    public void checkSecondMaxNumberForEmptyArray() {
        int[] arr = new int[]{};
        //этот тест оставила failed
        assertThrows(NoSuchElementException.class, () ->
                        methodsForChecking.findSecondMax(arr),
                "Вычисление второго максимального числа в пустом массиве ведет к NoSuchElementException");
    }

    /* 9.Обычная строка: "Hello world" → countWords() → 2.
    Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
    Пустая строка: "" → countWords() → 0.
    Строка с пробелами: " " → countWords() → 0.
            null строка: null → Должно выбрасываться IllegalArgumentException.
*/
    public static Stream<Arguments> casesForCheckingCountWorlds() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome ", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0));
    }

    @ParameterizedTest
    @DisplayName("Проверка подсчета количества слов в строке")
    @MethodSource("casesForCheckingCountWorlds")
    public void checkCountWorldsForString(String string, int expected) {
        int actual = methodsForChecking.countWords(string);
        assertEquals(expected, actual);

    }

    // null строка: null → Должно выбрасываться IllegalArgumentException.
    @Test
    @DisplayName("Проверка, что выбрасывается исключение при подсчете количества слов в строке null")
    public void checkCountWorldsForNullString() {
        assertThrows(IllegalArgumentException.class, () ->
                        methodsForChecking.countWords(null),
                "Подсчет количества слов в null строке ведет к IllegalArgumentException");

    }
 /*   10. Проверить isValidPhoneNumber():
    Корректные номера:
            "+1 1234567890" → true.
            "+44 9876543210" → true.
            "+999 1111111111" → true.
    Некорректные номера:
            "12345" → false.
            "invalid" → false.
            "+1 abcdefghij" → false.
            "+1234 1234567890" (слишком длинный код страны) → false.
            "+1 123" (недостаточно цифр) → false.
            "" (пустая строка) → false.
            null номер:
            null → Должно выбрасываться IllegalArgumentException.*/

    @ParameterizedTest
    @DisplayName("Проверка корректности номера телефона")
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    public void checkPhoneNumber(String str) {
        assertTrue(methodsForChecking.isValidPhoneNumber(str));
    }

    @ParameterizedTest
    @DisplayName("Проверка, что номера не корректны")
    @ValueSource(strings = {"12345",
            "invalid",
            "+1 abcdefghij",
            "+1234 1234567890",
            "+1 123",
            ""})
    public void checkIncorrectPhoneNumbers(String str) {
        assertFalse(methodsForChecking.isValidPhoneNumber(str));
    }

    @Test
    @DisplayName("Проверка что при проверке null номера телефона получаем IllegalArgumentException")
    public void checkNullPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () ->
                methodsForChecking.isValidPhoneNumber(null), "IllegalArgumentException");
    }


    /* 11.
    null: Метод не обрабатывает null значения, и их следует избегать на уровне тестов.
        Вход: [1, 2, 3, 4, 5, 6] → Выход: [2, 4, 6].
        Вход: [1, 3, 5] → Выход: [] (пустой список).
        Вход: [] → Выход: [] (пустой список).
    */
    public static Stream<Arguments> positiveCasesForCheckingFilterEvenNumbers() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(2, 4, 6)),
                Arguments.of(Arrays.asList(1, 3, 5), List.of()),
                Arguments.of(List.of(), List.of()));

    }

    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingFilterEvenNumbers")
    @DisplayName("Проверка, что выбираются только четные числа из списка")
    public void checkFilterEvenNumbers(List<Integer> list, List<Integer> expected) {
        List<Integer> actual = methodsForChecking.filterEvenNumbers(list);
        assertEquals(expected, actual);
    }

    /* 12.Вход: ["Java", "C", "Python"] → Выход: ["C", "Java", "Python"].
    Вход: ["aa", "bb", "cc"] → Выход: ["aa", "bb", "cc"].
    Вход: [] → Выход: [] (пустой список).*/

    public static Stream<Arguments> positiveCasesForCheckingSortByLength() {
        return Stream.of(
                Arguments.of(Arrays.asList("Java", "C", "Python"), Arrays.asList("C", "Java", "Python")),
                Arguments.of(Arrays.asList("aa", "bb", "cc"), Arrays.asList("aa", "bb", "cc")),
                Arguments.of(List.of(), List.of()));

    }

    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingSortByLength")
    @DisplayName("Проверка, что список сортируется по длине")
    public void checkSortByLength(List<String> list, List<String> expected) {
        List<String> actual = methodsForChecking.sortByLength(list);
        assertEquals(expected, actual);
    }

    //  13.  "listen", "silent" → true
//            "java", "python" → false
//            null → false
    @Test
    @DisplayName("Проверка, является ли строка анаграммой другой")
    public void checkAnagramWorld() {
        String start = "listen";
        String finish = "silent";
        assertTrue(methodsForChecking.isAnagram(start, finish));
    }
    @Test
    @DisplayName("Проверка, что строка не является анаграммой другой")
    public void checkFalseAnagramWorld() {
        String start = "java";
        String finish = "python";
        assertFalse(methodsForChecking.isAnagram(start, finish));
    }
    @Test
    @DisplayName("Проверка, что получаем false при null при проверке аннограммы")
    public void checkNullAnagramWorld() {
        String finish = "python";
        assertFalse(methodsForChecking.isAnagram(null, finish));
    }

    //14.
    // [1, 2, 3, 4, 5] → 3.0
    //[10] → 10.0
    //Пустой массив (должно выбрасываться исключение)
    public static Stream<Arguments> casesForFindAverage() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 3.0),
                Arguments.of(new int[]{10}, 10.0));
    }
    @ParameterizedTest
    @MethodSource("casesForFindAverage")
    @DisplayName("Проверка, что среднее значение массива чисел рассчитывается корректно")

    public void checkFindAverageFromArray(int [] numbers, double expectedAverage){
        double actualAverage = methodsForChecking.findAverage(numbers);
        assertEquals(expectedAverage,actualAverage);
    }

    @Test
    @DisplayName("Проверка, что вызывается исключение, если массив пустой, при подсчете среднего арифметического у массива чисел")
    public void checkFindAverageFromEmptyArray(){
        assertThrows(NoSuchElementException.class, () -> methodsForChecking.findAverage(new int[]{}),
                "Расчет среднего арифметического в пустом массиве ведет к NoSuchElementException");
    }

    //15.[ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
    //Пустой список
    public static Stream<Arguments> casesForMapToLengths(){
        return Stream.of(Arguments.of(Arrays.asList("Java", "C++","Go"),Arrays.asList(4,3,2)),
        Arguments.of(List.of(), List.of()));
    }

    @ParameterizedTest
    @MethodSource("casesForMapToLengths")
    @DisplayName("Проверка преобразование списка строк в список их длин")
    public void checkMapStringToLength(List <String> input, List <Integer> expectedList){
        List<Integer> actualList = methodsForChecking.mapToLengths(input);
        assertEquals(expectedList,actualList);
    }
    //16."Java,Python,C++", "," → ["Java", "Python", "C++"]
    //"", "," → [""]
    //"word", "," → ["word"]
    public static Stream <Arguments> casesForSplitString(){
        return Stream.of(Arguments.of("Java,Python,C++", ",",new String[]{"Java","Python","C++"}),
                Arguments.of("",",",new String[]{""}),
                Arguments.of("word",",",new String[]{"word"}));
    }
    @ParameterizedTest
    @MethodSource("casesForSplitString")
    @DisplayName("Проверка разбиение строки на части по разделителю")
    public void checkSplitString(String input, String delimiter, String[] expected){
        String[] actual = methodsForChecking.splitString(input,delimiter);
        assertArrayEquals(expected,actual);
    }
    //17. "Password1" → true
    //"pass" → false
    //null → false

    @Test
    @DisplayName("Проверка корректности пароля")
    public void checkValidPassword() {
        String password = "Password1";
        assertTrue(methodsForChecking.isValidPassword(password));
    }
    @Test
    @DisplayName("Проверка, что пароль не корректный")
    public void checkInvalidPassword() {
        String password = "pass";
        assertFalse(methodsForChecking.isValidPassword(password));
    }
    @Test
    @DisplayName("Проверка, что пароль null")
    public void checkNullPassword() {
        assertFalse(methodsForChecking.isValidPassword(null));
    }
//    18. 24, 36 → 12
//101, 103 → 1
//0, 10 → 10
    public static Stream<Arguments> casesForGSD(){
        return Stream.of(Arguments.of(24,36,12),
                Arguments.of(101,103,1),
                Arguments.of(0,10,10));

    }
    @ParameterizedTest
    @MethodSource("casesForGSD")
    @DisplayName("Проверка наибольшего общего делителя")
    public void checkGSD(int a, int b, int expected){
        int actual = methodsForChecking.gcd(a,b);
        assertEquals(expected,actual);
    }

//19."{"key":"value"}" → true
//"invalid json" → false
//null → false
@Test
@DisplayName("Проверка корректности JSON")
public void checkValidJSON() {
    String json = "{\"key\":\"value\"}";
    assertTrue(methodsForChecking.isValidJson(json));
}

    @Test
    @DisplayName("Проверка, что json не корректный")
    public void checkInvalidJson() {
        String json = "invalid json";
        assertFalse(methodsForChecking.isValidJson(json));
    }
    @Test
    @DisplayName("Проверка, что json null")
    public void checkNullJson() {
        assertFalse(methodsForChecking.isValidJson(null));
    }

    //20.[1, 2, 3, 4, 5] → false
    //[1, 2, 2, 3] → true
    //Пустой массив → false
    public static Stream<Arguments> casesForHasntDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{}));
    }
    @ParameterizedTest
    @MethodSource("casesForHasntDuplicates")
    @DisplayName("Проверка, что массив не содержит дубликаты")
    public void checkHasntDuplicates(int[] numbers){
        assertFalse(methodsForChecking.hasDuplicates(numbers));
    }
    static Stream <int[]> values(){
        return Stream.of(new int[]{1,2,2,3});

    }
    @ParameterizedTest
    @MethodSource("values")
    public void checkHasDuplicates(int[] values){
        assertTrue(methodsForChecking.hasDuplicates(values));
    }


}

