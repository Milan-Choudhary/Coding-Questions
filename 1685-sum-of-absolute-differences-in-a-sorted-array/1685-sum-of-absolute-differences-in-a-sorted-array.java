class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int[] res = new int[nums.length];
        long[] prefix = new long[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        } 

        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                long val = prefix[n - 1] - (1L * n * nums[i]);
                res[i] = (int)val; 
            }

            else if(i == nums.length - 1){
                long val = prefix[n - 2] - (1L * i * nums[i]);
                res[i] = (int)Math.abs(val);
            }

            else{
                long left = prefix[i-1] - (1L * i * nums[i]);
                long right = (prefix[n-1] - prefix[i-1]) - (1L * (n-i)*nums[i]);

                long val = 1L * Math.abs(left) + Math.abs(right);
                res[i] = (int)val;
            }
            

        }

        return res;

    }
}