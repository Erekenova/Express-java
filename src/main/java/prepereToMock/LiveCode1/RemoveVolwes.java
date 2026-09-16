package prepereToMock.LiveCode1;

public class RemoveVolwes {
    public static String removeVowels(String str){
        StringBuilder result = new StringBuilder();
        for (Character c : str.toLowerCase().toCharArray()){
        if (( "уеёыаоэяию".indexOf(c)) < 0){
            result.append(c);
         }
        }
        return result.toString();
    }
    static void main() {
        System.out.println(removeVowels("Я иду шагаю по москве"));
        System.out.println(removeVowelsNew("Я иду шагаю по МОскве"));
    }
    public static String removeVowelsNew(String s) {
        return s.toLowerCase().replaceAll("[aoieyуеоаыюэия]", "");
    }
}
