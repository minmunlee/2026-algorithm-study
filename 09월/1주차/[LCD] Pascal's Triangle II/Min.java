import java.util.*;

class Min {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        if(rowIndex == 0) {
            answer.add(1);
            return answer;
        }
        if(rowIndex == 1) {
            answer.add(1);
            answer.add(1);
            return answer;
        }

        answer.add(1);
        answer.add(1);

        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j = 0; j < answer.size() - 1; j++) {
                nextRow.add(answer.get(j) + answer.get(j + 1));
            }

            nextRow.add(1);
            answer = nextRow;
        }
        return answer;
    }
}