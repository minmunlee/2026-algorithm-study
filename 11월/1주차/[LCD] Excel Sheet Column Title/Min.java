class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber < 27) return String.valueOf((char)(columnNumber + 64));

        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            if(columnNumber % 26 == 0) {
                sb.append('Z');
                columnNumber /= 26;
                columnNumber -= 1;
                continue;
            } 
            sb.append((char)(columnNumber % 26 + 64));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}