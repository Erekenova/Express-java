package prepereToMock.LiveCode1;

public class StartsWith {
    public static boolean startsWith(String word, String prefix) {
        if (prefix.length() > word.length()) return false;
        for (int i = 0; i < prefix.length(); i++) {
            if (word.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }

    static void main() {
        System.out.println(startsWith("string","sto"));
    }
}

