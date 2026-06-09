class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            big = Math.max(big,nums[i]);
            small = Math.min(small,nums[i]);
        }

        return (big-small)*1L*k;


    }
}