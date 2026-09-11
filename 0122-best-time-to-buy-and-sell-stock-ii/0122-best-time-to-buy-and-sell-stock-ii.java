class Solution {
    public int maxProfit(int[] prices) {
        
        int[][] dp = new int[prices.length+1][2];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = compute(prices,0,1,dp);
        return ans;
        
    }

    public static int compute(int[] nums,int i,int buy,int[][] dp){

        if(i == nums.length){
            return 0;
        }

        if(dp[i][buy] != -1){
            return dp[i][buy];
        }

        int profit = 0;

        if(buy == 1){

            profit = Math.max(compute(nums,i+1,0,dp) - nums[i],compute(nums,i+1,1,dp));

        }
        else{
            
            profit = Math.max(compute(nums,i+1,1,dp) + nums[i],compute(nums,i+1,0,dp));

        }

        dp[i][buy] = profit;

        return dp[i][buy];
    }

}