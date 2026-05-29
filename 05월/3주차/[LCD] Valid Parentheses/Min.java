import java.util.*;

class Min {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '{' && c != '}') return false;
                if (open == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }
}