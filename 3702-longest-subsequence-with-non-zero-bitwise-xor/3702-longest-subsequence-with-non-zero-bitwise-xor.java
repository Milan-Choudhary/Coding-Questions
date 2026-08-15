class Solution {
    public int longestSubsequence(int[] nums) {
        int index = 0;

        while(index < nums.length && nums[index] == 0){
            index += 1;
        }

        if(index == nums.length){
            return 0;
        }

        int num = 0;
        

        while(index < nums.length - 1){
            num ^= nums[index];
            index += 1;
        }

        return (num ^= nums[index]) != 0 ? nums.length : nums.length - 1;


    }
}