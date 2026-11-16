import java.util.*;
class Mun {
    public int solution(int[][] scores) {
        int[] wanho = scores[0];
        Arrays.sort(scores, (o1, o2) -> {
            return (o1[0] == o2[0]) ? o1[1] - o2[1] : o2[0] - o1[0];
        });
        ArrayList<Integer> sum = new ArrayList<>();
        int maxB = scores[0][1];
        sum.add(scores[0][0] + scores[0][1]);
        for(int i=1;i<scores.length;i++) {
            int a = scores[i][0];
            int b = scores[i][1];
            if(b < maxB) {
                if(a == wanho[0] && b == wanho[1]) {
                    return -1;
                }
                continue;
            } 
            sum.add(a + b);
            maxB = b;
        }
        Collections.sort(sum, Collections.reverseOrder());
        int rank = 0;
        int wanhoSum = wanho[0] + wanho[1];
        while(rank < sum.size()) {
            int s = sum.get(rank);
            rank++;
            if(s == wanhoSum) {
                return rank;
            }
            while(rank < sum.size() && sum.get(rank) == s) {
                rank++;
            }
        }
        return rank;
    }
}