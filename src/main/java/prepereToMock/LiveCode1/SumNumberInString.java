package prepereToMock.LiveCode1;

public class SumNumberInString {
    static void main() {
        System.out.println(sumNumbers("У Маши 3 груши и 10 яблок"));
    }
    public static int sumNumbers(String str) {
        int sum = 0, num = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                sum += num;
                num = 0;
            }
        }
        return sum + num;
    }
}
