class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        if(nums.length == 1){
            return 1;
        }

        int len = 0;
        int right_big = 1;
        int right_small = 1;

        for(int i = 0; i<nums.length - 1; i++){

            if(nums[i] < nums[i+1]){
                right_big += 1;
                right_small = 1;
            }
            else if(nums[i] > nums[i+1]){
                right_small += 1;
                right_big = 1;
            }
            else{
                right_small = 1;
                right_big = 1;
            }

            len = Math.max(len,Math.max(right_big,right_small));

        }

        return len;


    }
}