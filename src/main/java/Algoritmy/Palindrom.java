package Algoritmy;
// дано слово, является ли оно палиндромом
// abba -> true
// ba -> false
//left = 0;
///*
/// right = word.length-1
/// while(left < right)
/// if !(word[left] == word[right])
/// return false
/// left++;
/// right--;
/// */
public class Palindrom {
    public static void main() {
        String word = "ab ba";
        String word1 = "Baa  b";
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome2(word1));
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome(word1));
    }
//не учитывает пробелы
    public static boolean isPalindrom(String word) {

        int left = 0;
        int right = word.length() - 1;
        boolean isPal = true;
        while (left < right) {
            if (!(word.charAt(left) == word.charAt(right))) {
                isPal = false;
                break;
            }
            left++;
            right--;
        }
        return isPal;
    }

     static boolean isPalindrome2(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().toString().equals(clean);
    }
    public static boolean isPalindrome(String str){
        if (str == null) return false;
        String clear = str.replaceAll("\\s+","").toLowerCase();
        int left = 0;
        int right =clear.length() - 1;

        boolean isPal = true;
        while (left < right){
            if(!(clear.charAt(left) == clear.charAt(right))){
                isPal = false;
                break;
            }
            else {
                left++;
                right--;
            }
        }
        return isPal;
    }
}
