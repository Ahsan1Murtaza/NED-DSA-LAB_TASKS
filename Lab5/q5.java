
public class q5 {

    public static boolean checkBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

        
            // If opening bracket (, {, [
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket ), }, ]
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') ) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, all brackets matched
    }
    public static void main(String[] args) {

        String expression1 = "(A + B) * (C - D)";
        String expression2 = "(A + B) * (C - D))";
        String expression3 = "(A + B) * (C - D]";

        boolean ans1 = checkBalanced(expression1);
        boolean ans2 = checkBalanced(expression2);
        boolean ans3 = checkBalanced(expression3);

        System.out.println("Expression: " + expression1 + " is balanced: " + ans1);
        System.out.println("Expression: " + expression2 + " is balanced: " + ans2);
        System.out.println("Expression: " + expression3 + " is balanced: " + ans3);

    }
}
