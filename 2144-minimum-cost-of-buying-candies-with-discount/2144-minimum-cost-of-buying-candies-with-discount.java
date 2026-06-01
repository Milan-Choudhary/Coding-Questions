class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int i = cost.length - 1;

        int free = 2;
        int buy = 0;



        while(i >= 0){
            if(free == 0){
                free = 2;
                i -= 1;
                continue;
            }

            buy += cost[i];
            free -= 1;
            i -= 1;

        }

        return buy;


    }
}