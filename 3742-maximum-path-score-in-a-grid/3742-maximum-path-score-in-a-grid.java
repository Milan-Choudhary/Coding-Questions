class Solution {
    public int maxPathScore(int[][] grid, int k) {
        
        Integer[][][] dp = new Integer[grid.length+1][grid[0].length+1][k+1];

        int ans = compute(0,0,grid,k,dp);
        return  ans = ans >= 0 ? ans : -1;

    }

    public static int compute(int i,int j,int[][] grid,int k,Integer[][][] dp){

        if(i == grid.length - 1 && j == grid[0].length - 1){
            if(grid[i][j] != 0 && k == 0){
                return Integer.MIN_VALUE/2;
            }

            return grid[i][j];
        }

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || (k == 0 && grid[i][j] != 0)){
            return Integer.MIN_VALUE/2;
        }

        if(grid[i][j] != 0){
            k -= 1;
        }

        if(dp[i][j][k] != null){
            return dp[i][j][k];
        }

       
        int right = compute(i,j+1,grid,k,dp);
        int down = compute(i+1,j,grid,k,dp);

        dp[i][j][k] = grid[i][j] + Math.max(right,down);

        return dp[i][j][k];

    }

}