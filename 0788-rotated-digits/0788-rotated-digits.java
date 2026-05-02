class Solution {
    public int rotatedDigits(int n) {
        
        int c = 0;
        for(int i = 1; i<=n; i++){
            if(isValid(i)){
                c += 1;
            }
        }

        return c;

    }

    public static boolean isValid(int num){
        boolean possible = false;

        while(num > 0){
            int val = num%10;
            if(val == 2 || val == 5 || val == 6 || val == 9){
                possible = true;
            }

            else if(val == 3 || val == 4 || val == 7){
               return false;
            }

            num = num/10;
        }

        return possible;

    }
}