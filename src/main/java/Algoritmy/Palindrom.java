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
        String word = "abba";
        String word1 = "ba";
        System.out.println(isPalindrom(word));
        System.out.println(isPalindrom(word1));
    }

    public static boolean isPalindrom(String word){
        int  left = 0;
        int right = word.length()-1;
        boolean isPal = true;
        while(left < right) {
            if (!(word.charAt(left) == word.charAt(right))) {
              isPal = false;
              break;
            }
            left++;
            right--;
        }
        return isPal;
    }
}
