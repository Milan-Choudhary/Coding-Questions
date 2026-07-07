class Solution {
    public long sumAndMultiply(int n) {

        long ans = 0;

        ans = compute(n);
        return ans;
        
    }

    public static long compute(int n){

        long x = 0;
        long sum = 0;

        while(n > 0){
            int val = n%10;
            if(val != 0){
                x = x*10 + val;
                sum += val;
            }
            
            n = n/10;
        }

        long rev = 0;

        while(x > 0){
            long val = x%10;
            rev = rev*10 + val;
            x = x/10;
        }

        return rev*sum;

    }
}