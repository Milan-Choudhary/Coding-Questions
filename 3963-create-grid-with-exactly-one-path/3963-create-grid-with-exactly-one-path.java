class Solution {
    public String[] createGrid(int m, int n) {
        
        String[] ans = new String[m];


        for(int i = 0; i<m; i++){
            StringBuilder res = new StringBuilder();
            for(int j = 0; j<n; j++){
                if(i == 0){
                    res.append(".");
                }
                else if(j == n - 1){
                    res.append(".");
                }
                else{
                    res.append("#");
                }
                
            }   

            ans[i] =  res.toString();        
        }

        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //     }   
                   
        // }



        // compute(ans,0,0);

        return ans;

    }

    // public static boolean compute(String[] ans,int i,int j){

    //     if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length){
    //         return;
    //     }

    //     if(i == grid.length - 1 && j == grid[i].length - 1){
    //         return true;
    //     }

    // }

}