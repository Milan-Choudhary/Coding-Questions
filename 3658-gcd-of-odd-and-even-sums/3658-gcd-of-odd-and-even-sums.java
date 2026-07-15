class Solution {
    public int gcdOfOddEvenSums(int n) {

        long odd_sum = 0;
        long even_sum = 0;

        if(n%2 == 0){
            long val = n/2;
            odd_sum = val * (2 + (n-1)*2);
            even_sum = val * (4 + (n-1)*2);
        }
        else{

            long val1 = (2 + (n-1)*2)/2;
            long val2 = (4 + (n-1)*2)/2;
            odd_sum = val1*n;
            even_sum = val2*n;

        }

        int ans = compute(odd_sum,even_sum);

        return ans;
        
    }

    public static int compute(long odd_sum,long even_sum){

        if(even_sum == 0){
            return (int)odd_sum;
        }

        return compute(even_sum,odd_sum%even_sum);

    }
}