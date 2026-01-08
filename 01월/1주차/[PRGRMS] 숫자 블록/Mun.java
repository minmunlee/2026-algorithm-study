class Mun {
    public int[] solution(long begin, long end) {
        int size = (int) (end - begin) + 1;
        int[] answer = new int[size];
        for(int i=0;i<size;i++) {
            long now = begin + i;
            answer[i] = (int) getMax(now);
        }
        if(begin == 1) {
            answer[0] = 0;
        }
        return answer;
    }
    
    private long getMax(long num) {
        long max = 1;
        for(long i=2;i<=Math.sqrt(num);i++) {
            if(num % i == 0) {
                if(num / i > 10000000) { 
                    max = i;
                    continue;
                } else {
                    return (num / i);
                }
            }
        }
        return max;
    }
}