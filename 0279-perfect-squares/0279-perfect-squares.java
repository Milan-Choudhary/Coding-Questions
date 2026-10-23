class Solution {
    public int numSquares(int n) {

        int num = 1;

        while(num*num <= n){
            num += 1;
        }
        
        int[] arr = new int[num];

        for(int i = 1; i<=num; i++){
            arr[i-1] = i*i; 
        }

        int[][] dp = new int[arr.length+1][n+1];

        for(int[] nums : dp){
            Arrays.fill(nums,-1);
        }

        int ans = compute(0,arr,n,dp);

        return ans;

    }

    public static int compute(int i,int[] arr, int n,int[][] dp){

        if(n == 0){
            return 0;
        }

        if(n < 0 || i >= arr.length){
            return Integer.MAX_VALUE/2;
        }

        if(dp[i][n] != -1){
            return dp[i][n];
        }

        int take = 1 + compute(i,arr,n - arr[i],dp);
        int skip = compute(i+1,arr,n,dp);

        dp[i][n] = Math.min(take,skip);

        return dp[i][n];

    }

}