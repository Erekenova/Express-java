package practice_11;

public class StringProcessor {
    /**
     * Метод для проверки, является ли строка палиндромом
     * Примеры:
     *   - "abba" -> true
     *   - "bba" -> false
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
