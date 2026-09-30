class Solution {
    public int totalNQueens(int n) {
        
        List<int[]> coordinates = new ArrayList<>();

        int ans = func(0,0,n,coordinates,0,0);

        return ans;
     
    }

    public static int func(int i,int j,int n,List<int[]> coordinates,int val,int c){

        if(val == n){
            return 1;
        }

        int ans = 0;

        while(j < n){
            if(check(i,j,coordinates)){

                coordinates.add(new int[]{i,j});
                val += 1;

                ans += func(i+1,0,n,coordinates,val,c);

                val -= 1;
                coordinates.remove(coordinates.size()-1);


            }

            j += 1;

        }


        return ans;

    }

    public static boolean check(int i,int j,List<int[]> coordinates){

        for(int m = 0; m<coordinates.size(); m++){
            int[] arr = coordinates.get(m);
            int x = arr[0];
            int y = arr[1];

            if(x == i || y == j || (Math.abs(x-i) == Math.abs(y - j))){
                return false;
            }

        }

        return true;

    }



}