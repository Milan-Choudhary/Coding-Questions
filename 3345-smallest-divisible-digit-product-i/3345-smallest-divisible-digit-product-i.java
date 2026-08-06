class Solution {
    public int smallestNumber(int n, int t) {
        
        int num = n; 

        while(true){

            int p = product(num);

            if(p%t == 0){
                break;
            }

            num += 1;

        }

        return num;


    }

    public static int product(int num){

        int p = 1;

        while(num > 0){

            p *= num%10;

            if(p == 0){
                return 0;
            }

            num = num/10;

        }

        return p;


    }

}