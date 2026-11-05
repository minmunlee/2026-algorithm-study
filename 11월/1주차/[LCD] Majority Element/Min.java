import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        Arrays.sort(nums);

        int n = nums[0];
        int max = 0;
        int maxCnt = 0;
        int compareCnt = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(n != nums[i]) {
                n = nums[i];
                if(maxCnt < compareCnt){
                    max = nums[i - 1];
                    maxCnt = compareCnt;
                }
                compareCnt = 1;
                
            } else {
                compareCnt += 1;
            }
        }

        if(compareCnt > maxCnt) max = nums[nums.length - 1];

        return max;
    }
}