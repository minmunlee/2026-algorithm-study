class Mun {
    public int titleToNumber(String columnTitle) {
        char[] ct = columnTitle.toCharArray();
        int num = 0;
        for(int i = 0; i<ct.length; i++) {
            int ctAsc = ct[i];
            num *= 26;
            num += ctAsc - 'A' + 1;
        }
        return num;
    }
}