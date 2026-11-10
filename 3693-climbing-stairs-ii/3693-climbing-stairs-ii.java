class Solution {
    public int climbStairs(int n, int[] cost) {
        if(n == 1){
            return cost[0] + 1;
        }

        int[] dp = new int[n+1];

        dp[1] = cost[0] + 1;
        dp[2] = cost[1] + Math.min((4+0),(1+dp[1]));

        if(n == 2){
            return dp[2];
        }

        dp[3] = cost[2] + Math.min((1+dp[2]),Math.min((4+dp[1]),(9+0)));

        if(n == 3){
            return dp[3];
        }

        
        for(int i = 4; i<dp.length; i++){
            int a = (i - (i-3))*(i - (i-3));
            int b = (i - (i-2))*(i - (i-2));
            int c = (i - (i-1))*(i - (i-1));
            dp[i] = cost[i-1] + Math.min((dp[i-1]+c),Math.min((dp[i-2]+b),(dp[i-3]+a)));
        }

        return dp[dp.length - 1];
        

    }
}