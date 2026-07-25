class Solution {
    public int maxProduct(int n) {
        
        int val1 = 0;
        int val2 = 0;

        while(n > 0){
            int val = n%10;
            if(val > val1){
                val2 = val1;
                val1 = val;
            }
            else if(val > val2){
                val2 = val;
            }
            
            n = n/10;

        }

        return val1*val2;


    }
}