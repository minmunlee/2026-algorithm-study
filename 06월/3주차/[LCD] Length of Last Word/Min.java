import java.util.*;

class Min {
    public int lengthOfLastWord(String s) {
        StringTokenizer str = new StringTokenizer(s);
        List<String> list = new ArrayList<>();
        while(str.hasMoreTokens()) {
            list.add(str.nextToken());
        }

        return list.get(list.size() - 1).length();
    }
}