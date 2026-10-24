class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[][] arr = new int[12][];

        for(int i = 1; i<=12; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                arr[i-1] = new int[31];
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11){
                arr[i-1] = new int[30];
            }
            else{
                arr[i-1] = new int[28];
            }
        }

        for(int[] nums : arr){
            Arrays.fill(nums,0);
        }

        String[] AA = arriveAlice.split("-");
        String[] LA = leaveAlice.split("-");
        String[] AB =  arriveBob.split("-");
        String[] LB = leaveBob.split("-");

        int start_month = Integer.parseInt(AA[0]);
        int start_date = Integer.parseInt(AA[1]);
        int end_month = Integer.parseInt(LA[0]);
        int end_date = Integer.parseInt(LA[1]);

         int row = start_month - 1;
         int col = start_date - 1;
         int end_row = end_month - 1;
         int end_col = end_date - 1;

         for(int i = row; i<=end_row; i++){
            
            if(i == row && end_row != row){
                for(int j = col; j<arr[i].length; j++){
                    arr[i][j] = 1;
                }
            }
            else if((i == row && end_row == row)){
                for(int j = col; j<=end_col; j++){
                    arr[i][j] = 1;
                }
            }
            else if(i == end_row){
                for(int j = 0; j<=end_col; j++){
                    arr[i][j] = 1;
                }
            }
            else{
                for(int j = 0; j<arr[i].length; j++){
                    arr[i][j] = 1;
                }
            }

         }



        int b_start_month = Integer.parseInt(AB[0]);
        int b_start_date = Integer.parseInt(AB[1]);
        int b_end_month = Integer.parseInt(LB[0]);
        int b_end_date = Integer.parseInt(LB[1]);

        row = b_start_month - 1;
        col = b_start_date - 1;
        end_row = b_end_month - 1;
        end_col = b_end_date - 1;

         for(int i = row; i<=end_row; i++){
            
            if(i == row && end_row != row){
                for(int j = col; j<arr[i].length; j++){
                    arr[i][j] += 1;
                }
            }
            else if((i == row && end_row == row)){
                for(int j = col; j<=end_col; j++){
                    arr[i][j] += 1;
                }
            }
            else if(i == end_row){
                for(int j = 0; j<=end_col; j++){
                    arr[i][j] += 1;
                }
            }
            else{
                for(int j = 0; j<arr[i].length; j++){
                    arr[i][j] += 1;
                }
            }

         }

        int count = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                //System.out.print(arr[i][j] + " ");
                if(arr[i][j] == 2){
                    count += 1;
                }
            }
            //System.out.println();
        }


        return count;
       

        
    }
}