class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();

        while(k > 0){
            int m = grid.length - 1;
            int n = grid[0].length - 1;

            int temp1 = grid[m][n];

            for(int i = 0; i<=m; i++){
                for(int j = 0; j<=n; j++){
                    int temp2 = grid[i][j];
                    grid[i][j] = temp1;
                    temp1 = temp2;
                }
            }

            k -= 1;

        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                res.add(grid[i][j]);
            }
            ans.add(new ArrayList<>(res));
            res.clear();
        }

        return ans;

    }
}