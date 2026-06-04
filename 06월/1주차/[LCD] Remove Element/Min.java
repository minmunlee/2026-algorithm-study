class Min {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int num : nums) {
            if(val != num) {
                nums[idx] = num;
                idx += 1;
            }
        }

        return idx;
    }
}