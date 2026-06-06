class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length == 1){
            return new int[1];
        }

        int left = 0;
        int right = nums.length - 1;

        int[] left_prefix = new int[nums.length];
        int[] right_prefix = new int[nums.length];

        left += 1;
        right -= 1;

        while(left < nums.length){
            left_prefix[left] = nums[left-1] + left_prefix[left-1];
            right_prefix[right] = nums[right+1] + right_prefix[right+1];
            left += 1;
            right -= 1;
        }

        int[] res = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            res[i] = Math.abs(left_prefix[i] - right_prefix[i]);
        }

        return res;

    }
}