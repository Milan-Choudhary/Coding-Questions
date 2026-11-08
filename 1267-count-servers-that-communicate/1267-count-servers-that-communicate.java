class Solution {
    public int countServers(int[][] grid) {
        
      int ans = 0;

      boolean[][] matrix = new boolean[grid.length][grid[0].length];

      Queue<int[]> q = new LinkedList<>();

      for(int i = 0; i<grid.length; i++){
        int j = 0;
        q.clear();

        while(j < grid[i].length){

            if(grid[i][j] == 1){
                q.add(new int[]{i,j});
            }

            j += 1;

        }

        if(q.size() >= 2){
            while(q.size() > 0){
                int[] cord = q.poll();
                matrix[cord[0]][cord[1]] = true;
            }
        }      



      }



      for(int i = 0; i<grid[0].length; i++){
        int j = 0;
        q.clear();

        while(j < grid.length){

            if(grid[j][i] == 1){
                q.add(new int[]{j,i});
            }

            j += 1;

        }

        if(q.size() >= 2){
            while(q.size() > 0){
                int[] cord = q.poll();
                matrix[cord[0]][cord[1]] = true;
            }
        }      



      }

      int c = 0;

      for(int i = 0; i<matrix.length; i++){
        for(int j = 0; j<matrix[0].length; j++){
            if(matrix[i][j] == true){
                c += 1;
            }
        }
      }


        return c;



    }
}