class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        int[][] grid = new int[8][8];

        for(int[] arr : queens){
            grid[arr[0]][arr[1]] = 1;
        }

      

        int x = king[0];
        int y = king[1];

        // towards down
        for(int i = x+1; i<8; i++){
            if(grid[i][y] == 1){
                res.add(i);
                res.add(y);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }
        }

        
    
        //towards right
        for(int i = y+1; i<8; i++){
            if(grid[x][i] == 1){
                res.add(x);
                res.add(i);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }
        }
   
      
        //towards up
        for(int i = x-1; i>=0; i--){
            if(grid[i][y] == 1){
                res.add(i);
                res.add(y);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }
        }
     
       
        //towards left
        for(int i = y-1; i>=0; i--){
            if(grid[x][i] == 1){
                res.add(x);
                res.add(i);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }
        }

          
        int row = 0;
        int col = 0;

        //towards top left
         row = x;
         col = y;

        while(row >=0 && col >= 0){
            if(grid[row][col] == 1){
                res.add(row);
                res.add(col);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }

            row -= 1;
            col -= 1;
        }

         
        //towards top right

        row = x;
        col = y;

         while(row >=0 && col < 8){
            if(grid[row][col] == 1){
                res.add(row);
                res.add(col);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }

            row -= 1;
            col += 1;
        }

          
      
        //towards bottom left

        row = x;
        col = y;

         while(row < 8 && col >= 0){
            if(grid[row][col] == 1){
               res.add(row);
                res.add(col);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }

            row += 1;
            col -= 1;
        }

          
      

        //towards bottom right

        row = x;
        col = y;

         while(row < 8 && col < 8){
            if(grid[row][col] == 1){
                res.add(row);
                res.add(col);
                list.add(new ArrayList<>(res));
                res.clear();
                break;
            }

            row += 1;
            col += 1;
        }

          
        

        return list;

    }
}