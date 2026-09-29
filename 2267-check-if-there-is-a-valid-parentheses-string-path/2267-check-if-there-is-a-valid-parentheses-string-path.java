class Solution {
    public boolean hasValidPath(char[][] grid) {
        
        Boolean[][][] dp = new Boolean[grid.length+1][grid[0].length+1][(grid.length*grid[0].length)/2+3];

        boolean ans = compute(0,0,grid,1,dp);

        return ans;


    }

    public static boolean compute(int i,int j,char[][] grid,int balance,Boolean[][][] dp){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || balance < 1 || balance > (grid.length*grid[0].length)/2 + 1){
            return false;
        }

        if(grid[i][j] == '('){
            balance += 1;
        }
        else{
            balance -= 1;
        }

        if(dp[i][j][balance] != null){  
            return dp[i][j][balance];
        }

        
        if(i == grid.length - 1 && j == grid[0].length - 1){
            
            return balance == 1;
        }
        
        

        boolean right = compute(i,j+1,grid,balance,dp);
        boolean down = compute(i+1,j,grid,balance,dp);

        
        dp[i][j][balance] =  right || down; 

        return dp[i][j][balance];


    }

}