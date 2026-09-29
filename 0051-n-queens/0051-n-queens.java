class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        String[][] grid = new String[n][n];
        List<int[]> queens = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        for(String[] arr : grid){
            Arrays.fill(arr,".");
        }

        func(0,0,grid,queens,ans);
              
        return ans;


    }

    public static void func(int i,int j,String[][] grid,List<int[]> queens,List<List<String>> ans){

        if(queens.size() == grid.length){
            List<String> res = new ArrayList<>();

            for(int m = 0; m<grid.length; m++){
                StringBuilder sb = new StringBuilder();
                for(int n = 0; n<grid.length; n++){
                    sb.append(grid[m][n]);
                }
                res.add(sb.toString());
            }

            ans.add(new ArrayList<>(res));

            return ;
        }

        while(j < grid.length){

            if(Check(i,j,queens)){
                queens.add(new int[]{i,j});
                grid[i][j] = "Q";

                func(i+1,0,grid,queens,ans);

                queens.remove(queens.size()-1);
                grid[i][j] = ".";

            }

          j += 1;
          
        }

        return ;
        

    }

    public static boolean Check(int i,int j,List<int[]> queens){

        for(int k = 0; k<queens.size(); k++){
            int[] coordinates = queens.get(k);
            int x = coordinates[0];
            int y = coordinates[1];

            if(i == x || j == y || (Math.abs(i-x) == Math.abs(j - y))){
                return false;
            }

        }

        return true;


    }
    
}