class Solution {
    public boolean checkDivisibility(int n) {
        
        int s = Sum(n);
        int p = Product(n);

        return n%(s+p) == 0;

    }

    public static int Sum(int n){

        int sum = 0;

        while(n > 0){
            sum += n%10;
            n = n/10;

        }

        return sum;

    }

    public static int Product(int n){

        int p = 1;

        while(n > 0){

            p *= n%10;

            if(p == 0){
                return 0;
            }

            n = n/10;

        }

        return p;

    }

}