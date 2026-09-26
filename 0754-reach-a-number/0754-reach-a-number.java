class Solution {
    public int reachNumber(int target) {
        
        if(target == 0){
            return 0;
        }

        int ans = 0;
        int i = 0;

        target = Math.abs(target);

        boolean flag = true;

        while(flag){

            int num = i*(i+1);
            int val = num/2;

            if(val >= target && (val-target)%2 == 0){
                ans = i;
                flag = false;
            }

            i += 1;

        }
        
        return ans;


    }
}