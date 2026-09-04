class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int[] max_values = new int[nums.length];
        int[] min_values = new int[nums.length];

        max_values[0] = nums[0];
        min_values[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i<nums.length; i++){
            max_values[i] = Math.max(max_values[i-1],nums[i]);
        }

        for(int i = nums.length - 2; i>=0; i--){
           min_values[i] = Math.min(min_values[i+1],nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            if(max_values[i] - min_values[i] <= k){
                return i;
            }
        }
        
        return -1;

    }
}