package prepereToMock.LiveCode1;
//Проверить, является ли строка палиндромом (без учета регистра и пробелов).
// aba abba
// ner
public class PalindromeNew {
    public static boolean isPalindrome(String str){
        String clear = str.toLowerCase().trim();
        int left = 0;
        int right = clear.length() - 1;
        while(left < right){
            if (!(clear.charAt(left) == clear.charAt(right) )){
                return false;
            }
            else {
                left++;
                right--;
            }

        }
        return true;
    }
    static void main() {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbsxsxa"));

    }
}
