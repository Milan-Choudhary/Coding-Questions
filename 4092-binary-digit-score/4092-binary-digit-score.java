class Solution {
    public int calculateScore(int a, int b) {
        
        int ans = 0;

        int c1 = 0;
        int c2 = 0;

        while(a > 0){
            int num = a%2;
            if(num == 1){
                c1 += 1;
            }
            a = a/2;
        }

        while(b > 0){
            int num = b%2;
            if(num == 1){
                c2 += 1;
            }
            b = b/2;
        }

        return c1 >= c2 ? c1*c2 : c2/c1;

    }
}