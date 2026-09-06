package prepereToMock.LiveCode1;
//abba
//aaabbbb
public class Palindrome {
    static void main() {
        String word = "";
        String word1 = "111!111";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome2(word1));
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            // Двигаем правый указатель, пока не встретим букву или цифру
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Приводим к нижнему регистру и сравниваем
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false; // Если не совпали — это не палиндром
            }

            // Сдвигаем оба указателя к центру
            left++;
            right--;

        }
        return true;
    }
    public static boolean isPalindrome2(String s){
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while (left < right){
            if (!(s.charAt(left) == s.charAt(right))){
                isPalindrome = false;
                break;
            }
            else {
                left++;
                right--;
            }

        }
        return isPalindrome;
    }
}
