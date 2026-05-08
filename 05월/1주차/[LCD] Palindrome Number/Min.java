class Min {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String reverse = new StringBuilder(s).reverse().toString();

        if(s.equals(reverse)) {
            return true;
        }
        return false;
    }
}