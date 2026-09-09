class Solution {
    public long countCommas(long n) {

    long c = 0;
    long count = 0;
    long i = 1000;

    while(i<=n){
        long val = i;
        c = 0;
        while(val > 0){
            val = val/10;
            c += 1;
        }
        
        long commas = c/3;
        
        long store = i;
        i = (long)(i*1000);

        if(i > n){
            long terms = n - store + 1;
            count += terms*commas;
        }
        else{
            long terms = i - store;
            count += terms*commas;
        }

    }

    return count;


    }

    
}