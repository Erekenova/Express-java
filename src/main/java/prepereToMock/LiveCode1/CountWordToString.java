package prepereToMock.LiveCode1;

public class CountWordToString {
    public static int countWordToString(String s){
        if(s == null || s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }

    static void main() {
        System.out.println(countWordToString("hello my little pony"));
    }
}
