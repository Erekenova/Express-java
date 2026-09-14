package prepereToMock.LiveCode1;

import java.util.Arrays;

public class CountWoldBySplit {
    public static int countWords(String str) {
         return (int) Arrays.stream(str.trim().
                 split("\\s+"))
                 .filter(s -> !s.isEmpty())
                 .count();
    }

    static void main() {
        System.out.println(countWords("Я иду гулять в парк"));
    }
}
