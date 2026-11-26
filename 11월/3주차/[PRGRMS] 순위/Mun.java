class Mun {
    public int solution(int n, int[][] results) {
        int[][] outcome = new int[n+1][n+1];
        for(int[] r : results) {
            int win = r[0];
            int lose = r[1];
            outcome[win][lose] = 1;
            outcome[lose][win] = -1;
        }
        for(int m=1;m<=n;m++) { // 기준 m
            for(int w=1;w<=n;w++) {
                for(int l=1;l<=n;l++) {
                    // m을 이긴 w와 m한테 진 l 연결
                    if(outcome[w][m] == 1 && outcome[m][l] == 1) {
                        outcome[w][l] = 1;
                        outcome[l][w] = -1;
                    }
                }
            }
        }
        int answer = 0;
        for(int i=1;i<=n;i++) {
            boolean c = true;
            for(int j=1;j<=n;j++) {
                if(i!=j && outcome[i][j] == 0) {
                    c = false;
                    break;
                }
            }
            if(c) {
                answer++;
            }
        }
        return answer;
    }
}