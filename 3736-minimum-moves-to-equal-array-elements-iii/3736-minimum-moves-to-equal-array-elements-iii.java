class Solution {
    public int minMoves(int[] nums) {
        
        int val = nums[0];

        for(int i = 1; i<nums.length; i++){
            val = Math.max(val,nums[i]);
        }

        int ans = 0;

        for(int num : nums){
            ans += val - num;
        }

        return ans;

    }
}