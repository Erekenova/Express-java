package prepereToMock.LiveCode1;

import java.util.Arrays;

//arfa
//fara
public class Anagram {
    public static boolean isAnagram(String a, String b){
        char[] ca = a.toCharArray(), cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }
    public static boolean isAn(String a, String b){
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return  Arrays.equals(a1,b1);
    }

    static void main() {
        System.out.println(isAnagram("arfa","fara"));
        System.out.println(isAnagram("arfa","faa"));
    }
}
