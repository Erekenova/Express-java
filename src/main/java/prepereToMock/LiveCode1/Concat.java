package prepereToMock.LiveCode1;
//Собрать строку из массива слов, разделяя пробелами.
//["world", "Hello"]
//"world Hello"
public class Concat {
    public static String concatStr(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
    static void main() {
        System.out.println(concatStr(new String[]{"world", "Hello"}));
    }
}
