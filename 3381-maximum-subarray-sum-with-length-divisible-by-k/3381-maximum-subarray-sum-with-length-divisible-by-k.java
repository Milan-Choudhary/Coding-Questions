class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long ans = Long.MIN_VALUE;

        if(k == 1){

            long sum = 0;

            for(int num : nums){
                sum = Math.max(num,sum + num);
                ans = Math.max(sum,ans);
            }

            return ans;


        }

        
        long[] prefix_sum = new long[nums.length+1];

        for(int i = 0; i<nums.length; i++){
            prefix_sum[i+1] = prefix_sum[i] + nums[i];
        }

        int num = k;

        while(num <= nums.length){

            int idx = num;

            ans = Math.max(ans,prefix_sum[idx]);
            idx += 1;

            while(idx <= nums.length){
                long sum = prefix_sum[idx] - prefix_sum[idx - num];
                ans = Math.max(ans,sum);
                idx += 1;
            }

            num += k;

        }


        return ans;
        

    }
}