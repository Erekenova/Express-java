package prepereToMock.LiveCode1;

public class PalindromeRepeate {
    public static boolean isPalindrome2(String s){
        if(s == null) return false;
        String clear = s.replaceAll("\\s+","").toLowerCase();
        return new StringBuilder(clear).reverse().toString().equals(clear);
    }
    public static boolean ispalindrome(String str){
        if(str == null) return false;
        String clear = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = clear.length() - 1;
        while (left < right){
            if (!(clear.charAt(left) == clear.charAt(right))){
                return false;
            }
            else {
                left++;
                right--;
            }

        } return true;

    }

    static void main() {
        System.out.println(ispalindrome("aabb"));
        System.out.println(ispalindrome("abba"));
        System.out.println(ispalindrome(""));
        System.out.println(ispalindrome(null));
        System.out.println(ispalindrome("a1h1a"));
        System.out.println(isPalindrome2("aabb"));
        System.out.println(isPalindrome2("abba"));
        System.out.println(isPalindrome2(null));
        System.out.println(isPalindrome2("a1h1a"));
        System.out.println(isPalindrome2("aabb"));


    }
}

