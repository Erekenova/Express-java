package prepereToMock.LiveCode1;
// корректная
//(),(()),()(),(())(),[](){}({})[]
//no
//(,),()()()(,{}],)))(((


import java.util.Stack;

public class BracketsValidator {
    static void main() {
        System.out.println(isBracketsValidator(")))((("));
        System.out.println(isBracketsValidator("{}]"));
        System.out.println(isBracketsValidator("()()()("));
        System.out.println(isBracketsValidator("(())()"));
        System.out.println(isBracketsValidator(")))((("));
        System.out.println(isBracketsValidator("[](){}({})[]"));
        System.out.println(isBracketsValidator(")))((("));
        System.out.println(isBalanced(")))((("));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("()()"));
        System.out.println(isBalanced("("));


    }
    public static boolean isBalanced(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else if (c == ')') balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
    public static boolean isBracketsValidator(String bracketString){
        Stack<Character> stack = new Stack<>();
        Boolean flag = true;
        for (Character c : bracketString.toCharArray()) {
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if (!(stack.isEmpty())) {
                    Character onTop = stack.peek();
                    if (
                            (c == '}' && onTop == '{')
                                    || (c == ']' && onTop == '[') ||
                                    (c == ')' && onTop == '(')) {
                        stack.pop();
                    } else
                        return false;
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
