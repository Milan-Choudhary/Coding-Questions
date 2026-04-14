class Solution {
    public int lengthOfLIS(int[] nums) {
        
        Integer[][] dp = new Integer[nums.length+1][nums.length+1];

        for(Integer[] rows : dp){
            Arrays.fill(rows,null);
        }

        int ans = compute(nums,-1,0,dp);

        ans = ans == 0 ? 1 : ans;
        return ans;

    }
    public static int compute(int[] nums,int prevIndex,int index,Integer[][] dp){

        if(index == nums.length){
            return 0;
        }

        if(dp[prevIndex+1][index] != null){
            return dp[prevIndex+1][index];
        }
        int skip = compute(nums,prevIndex,index+1,dp);

        int take = 0;
        if(prevIndex == -1 || nums[prevIndex] < nums[index]){ 
             take = 1 + compute(nums,index,index+1,dp);
        }

        dp[prevIndex+1][index] = Math.max(skip,take);
        return dp[prevIndex+1][index];

    }
}