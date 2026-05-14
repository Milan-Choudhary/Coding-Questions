class Solution {
    public boolean isGood(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length - 1 > nums[nums.length - 1] || nums.length - 1 < nums[nums.length - 1]){
            return false;
        }

        for(int i = 0; i<nums.length - 2; i++){
            if(nums[i] == nums[i+1]){
                return false;
            }
        }

        return true;

    }
}