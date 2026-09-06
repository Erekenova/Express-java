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

    static void main() {
        System.out.println(isAnagram("arfa","fara"));
        System.out.println(isAnagram("arfa","faa"));
    }
}
