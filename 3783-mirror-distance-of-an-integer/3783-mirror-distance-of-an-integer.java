class Solution {
    public int mirrorDistance(int n) {
        
        long rev = reverse(n);

        long val = Math.abs((long)n - rev);

        return (int)val;

    }

    public static long reverse(long num){

        long copy = 0;

        while(num > 0){
            long use = num%10;
            copy = copy*10 + use;
            num = num/10;
        }


        return copy;

    }
}