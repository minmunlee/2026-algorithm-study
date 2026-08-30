import java.util.*;

class Min {
    static List<List<Integer>> answer;
    public List<List<Integer>> generate(int numRows) {
        answer = new ArrayList<>();
        answer.add(Arrays.asList(1));
        if(numRows == 1) return answer;
        answer.add(Arrays.asList(1, 1));

        for(int i = 2; i < numRows; i++) {
            answer.add(setList(i));
        }

        return answer;
    }

    private static List<Integer> setList(int row) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 0; i < row - 1; i++) {
            list.add(answer.get(row - 1).get(i) + answer.get(row - 1).get(i + 1));
        }
        list.add(1);

        return list;
    }
}