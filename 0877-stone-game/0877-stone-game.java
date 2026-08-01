class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length+1][piles.length+1];

        for(int[] arr : dp){
            Arrays.fill(arr,Integer.MIN_VALUE);
        }
        int ans = compute(0,piles.length - 1,piles,dp);

        return ans >= 0;

    }

    public static int compute(int i,int j,int[] piles,int[][] dp){

        if(i > j){
            return 0;
        }

        if(dp[i][j] != Integer.MIN_VALUE){
            return dp[i][j];
        }


        int a = piles[i] - compute(i+1,j,piles,dp);
        int b = piles[j] - compute(i,j-1,piles,dp);

        dp[i][j] =  Math.max(a,b);
        return dp[i][j];

    }

}