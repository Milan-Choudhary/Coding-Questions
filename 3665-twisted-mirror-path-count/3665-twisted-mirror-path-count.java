class Solution {
    public int uniquePaths(int[][] grid) {
        
        long[][][] dp = new long[grid.length+1][grid[0].length+1][2];

        for(long[][] arr : dp){
            for(long[] val : arr){
                Arrays.fill(val,-1);
            }
        }


        long ans = compute(grid,0,0,1,dp);

        return (int)ans;

    }

    public static long compute(int[][] grid,int i,int j,int turn,long[][][] dp){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length){
            return 0;
        }

        if(i == grid.length - 1 && j == grid[0].length - 1){
            return 1;
        }

        if(dp[i][j][turn] != -1){
            return dp[i][j][turn];
        }

        long right = 0;
        long down = 0;

        if(grid[i][j] == 1){
            if(turn == 0){
                down = compute(grid,i+1,j,1,dp);

            }
            else{
                right = compute(grid,i,j+1,0,dp);
            }
        }
        else{
            right = compute(grid,i,j+1,0,dp);
            down = compute(grid,i+1,j,1,dp);

        }

        
        dp[i][j][turn] = (right + down)%1000_000_007;
        return dp[i][j][turn];

    }

}