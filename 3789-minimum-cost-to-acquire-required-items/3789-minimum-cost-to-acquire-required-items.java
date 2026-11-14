class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        long ans = Long.MAX_VALUE;

        long val = 1L*cost1*need1 + 1L*cost2*need2;

        int range = Math.max(need1,need2);

        long val2 = 1L*costBoth*range;

        int lower_bound = Math.min(need1,need2);

        long val3 = 1L*lower_bound*costBoth;

        if(need1 > lower_bound){
            int diff = need1 - lower_bound;
            val3 += 1L*diff*cost1;
        }
        else if(need2 > lower_bound){
            int diff = need2 - lower_bound;
            val3 += 1L*diff*cost2;
        }

        ans = Math.min(val,Math.min(val2,val3));

        // ans = Math.min(val,val2);

        // for(int i = range - 1; i>0; i--){

        //     long for_both = 1L*costBoth*i;
        //     long first_cost = 1L*(need1-i)*cost1;
        //     long sec_cost = 1L*(need2-i)*cost2;

        //     if(first_cost < 0){
        //         first_cost = 0;
        //     }

        //     if(sec_cost < 0 ){
        //         sec_cost = 0;
        //     }

        //     long total = first_cost + sec_cost + for_both;

        //     ans = Math.min(ans,total);

        // }

        return ans;


    }
}