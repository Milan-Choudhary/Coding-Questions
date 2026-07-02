class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        
        boolean[][] vis = new boolean[grid.size()][grid.get(0).size()];

        Boolean[][][] dp = new Boolean[grid.size()][grid.get(0).size()][health+1];

        boolean res = compute(grid,vis,0,0,health,dp);

        return res;
    }

    public static boolean compute(List<List<Integer>> grid,boolean[][] vis,int i,int j,int h,Boolean[][][] dp){

        if(i < 0 || j < 0 || i > grid.size() - 1  || j > grid.get(i).size() - 1 || h < 1 || vis[i][j] == true){
            return false;
        }

        
        if(grid.get(i).get(j) == 1){
            h -= 1;
        }

        if(i == grid.size() - 1 && j == grid.get(i).size() - 1 && h >= 1){
            return true;
        }

        if(dp[i][j][h] != null){
            return dp[i][j][h];
        }


        vis[i][j] = true;       


        boolean left = compute(grid,vis,i,j-1,h,dp);
        boolean right = compute(grid,vis,i,j+1,h,dp);
        boolean up = compute(grid,vis,i-1,j,h,dp);
        boolean down = compute(grid,vis,i+1,j,h,dp);

        vis[i][j] = false;

        dp[i][j][h] = left || right || up || down;
        return dp[i][j][h];

    }


}