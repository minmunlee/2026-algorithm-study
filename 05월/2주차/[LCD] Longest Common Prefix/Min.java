class Min {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        int len = 201;
        for(String str : strs) {
            len = Math.min(str.length(), len);
        }

        for(int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for(String str : strs) {
                if(str.charAt(i) != c) return prefix;
            }
            prefix += c;
        }

        return prefix;
    }
}