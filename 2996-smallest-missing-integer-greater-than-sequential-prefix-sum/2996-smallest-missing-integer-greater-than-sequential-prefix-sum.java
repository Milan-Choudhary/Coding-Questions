class Solution {
    public int missingInteger(int[] nums) {
        
        int maxsum = nums[0];
        int right = 1;

        while(right < nums.length && nums[right] - nums[right-1] == 1){
            maxsum += nums[right];
            right += 1;
        }

        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == maxsum){
                maxsum += 1;
            }
        }

        return maxsum;


    }
}