import java.util.*;

class Mun {
    HashMap<Character, Character> map = new HashMap<>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    public boolean isValid(String s) {
        Stack stack = new Stack();

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                stack.add(c);
            } else if(stack.size() > 0 && map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }

}