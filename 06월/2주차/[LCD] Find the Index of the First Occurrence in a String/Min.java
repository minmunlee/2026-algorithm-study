class Min {
    public int strStr(String haystack, String needle) {
        String[] hay = haystack.split("");
        String[] need = needle.split("");

        for (int i = 0; i < hay.length; i++) {
            if (hay[i].equals(need[0])) {
                if (i + needle.length() <= haystack.length()) {
                    String s = haystack.substring(i, i + needle.length());

                    if (s.equals(needle)) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}