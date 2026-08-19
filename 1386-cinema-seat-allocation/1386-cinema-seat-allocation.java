class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        Arrays.sort(reservedSeats,(a,b) -> (a[0] == b[0]) ? (a[1] - b[1]) : (a[0] - b[0]));

        // for(int i = 0; i<reservedSeats.length; i++){
        //     for(int j = 0; j<reservedSeats[i].length; j++){
        //         System.out.print(reservedSeats[i][j] + " ");
        //     }

        //     System.out.println();
        // }
        

        int ans = 0;
        int val = 1;
        int[] seats = new int[11];
        int c = 3;
        boolean first = true;
        boolean second = true;
        boolean third = true;
        int counter = 0;

        for(int[] arr : reservedSeats){

            int row = arr[0];
            int seat = arr[1];

            if(val != row){

                if(counter != 0){
                    if(c == 3){
                        ans += 2;
                    }
                    else{
                        ans += c != 0 ? 1 : c;
                    }

                    ans += (row - val - 1)*2;
                    counter = 0;
                }
                else{
                    ans += (row - val)*2;
                }

                
                val = row;   
                c = 3; 
                first = true;
                second = true;
                third = true;

            }

                if(seat >= 2 && seat <= 5 && first == true){
                    c -= 1;
                    first = false;
                }

                if(seat >= 4 && seat <= 7 && second == true){
                    c -= 1;
                    second = false;
                }

                if(seat >= 6 && seat <= 9 && third == true){
                    c -= 1;
                    third = false;
                }

                counter += 1;
                   

        }

        if(c == 3){
            ans += 2;
        }
        else{
            ans += c != 0 ? 1 : c;
        }

        ans += (n-val)*2;

        return ans;

    }
}