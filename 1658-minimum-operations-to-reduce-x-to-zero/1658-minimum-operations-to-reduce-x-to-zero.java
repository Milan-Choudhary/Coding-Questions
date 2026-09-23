class Solution {
    public int minOperations(int[] nums, int x) {
        
        long sum = 0;

        for(int num : nums){
            sum += num;
        }

        if(sum == x){
            return nums.length;
        }

        if(sum < x){
            return -1;
        }

        long target = sum - x;

        int left = 0;
        int right = 0;

        int len = 0;

        long val = 0;

        while(right < nums.length){

            val += nums[right];

            while(left < nums.length && val > target){
                val -= nums[left];
                left += 1;
            }

            if(val == target){
                len = Math.max(len,right - left + 1);
            }

            right += 1;

        }

        int ans = nums.length - len;
        return ans == nums.length ? -1 : ans;


    }
}