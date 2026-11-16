class Solution {
    public int titleToNumber(String columnTitle) {
        char[] arr = columnTitle.toCharArray();

        int len = arr.length;
        int answer = 0;

        for(int i = 0; i < len; i++) {
            int n = (int)arr[i] - 64;
            answer += n * (int)Math.pow(26, len - 1 - i);
        }

        return answer;
    }
}