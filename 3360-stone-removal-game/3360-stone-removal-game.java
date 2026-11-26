class Solution {
    public boolean canAliceWin(int n) {
        
        int first = 10;
        int second = 9;

        int c = 1;

        while(n > 0){

            if(c == 1){
                if(n < first){
                    return false;
                }
                n -= first;
                c = 2;
                first -= 2;
            }
            else{
                if(n < second){
                    return true;
                }
                n -= second;
                c = 1;
                second -= 2;
            }


        }

        return c == 1 ? false : true;


    }
}