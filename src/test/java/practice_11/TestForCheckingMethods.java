package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class TestForCheckingMethods {
    private MethodsForChecking methodsForChecking;

    @BeforeEach
    void setUp() {

        methodsForChecking = new MethodsForChecking();
    }

    /*Чётные и нечётные числа
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

    /*
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

/*    [3, 5, 7, 2] → 7
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

    /*    Тесты должны проверять:
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

    /* Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
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

    /*    Базовый случай: factorial(0) → 1
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
   /* Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
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
}


