package prepereToMock.LiveCode1;

//"привет мир" -> 3
public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(c) >= 0) count++;
        }
        return count;
    }
    public static int countV(String s){
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()){
            if ("aoeuiyаоуеёыэяию".indexOf(c) >= 0) count++;
        }
        return count;
    }

    static void main() {
        System.out.println(countVowels("Hello world"));
        System.out.println(countV("Hello world"));
    }
}
