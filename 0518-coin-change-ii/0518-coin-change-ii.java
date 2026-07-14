class Solution {
    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length+1][amount+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = compute(coins,amount,0,dp);

        return ans;

    }

    public static int compute(int[] coins,int t,int i,int[][] dp){

        if(i >= coins.length || t < 0){
           return 0;
        }

        if(t == 0){
            return 1;
        }

        if(dp[i][t] != -1){
            return dp[i][t];
        }


        int a = compute(coins,t-coins[i],i,dp);
        int b = compute(coins,t,i+1,dp);

        dp[i][t] = a+b;

        return dp[i][t];


    }
}