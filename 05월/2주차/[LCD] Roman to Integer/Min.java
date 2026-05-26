import java.util.*;

class Min {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = hm.get(c);
            if(i + 1 < s.length() && hm.get(s.charAt(i + 1)) > num) {
                sum += hm.get(s.charAt(++i)) - num;
                continue;
            }
            sum += num;
        }

        return sum;
    }
}