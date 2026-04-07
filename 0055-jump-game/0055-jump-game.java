class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length == 1){
            return true;
        }

        int maxreach = 0;

        for(int i = 0; i<nums.length; i++){

            if(i > maxreach){
                return false;
            }

            maxreach = Math.max(i + nums[i],maxreach);

            if(maxreach >= nums.length - 1){
                return true;
            }

        }

        return false;

    }
}