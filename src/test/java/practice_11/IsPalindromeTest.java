package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // позитивные кейсы
            "abba", "hah",
            // угловые кейсы
            "a", ""})
    @DisplayName("Проверка, что корректные строки распознаются как палиндромы")
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Проверка, что некорректные строки не распознаются как палиндромы")
    public void userCanCheckIfValidStringIsNotPalindrome() {
        String initialString = "john";
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertFalse(actualResult);
    }

    @Test
    @DisplayName("Проверка, что null вызывает IllegalArgumentException")
    public void userCannotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.isPalindrome(null);
        }, "Checking if Null string is palindrome should lead to IllegalArgumentException");
    }
}