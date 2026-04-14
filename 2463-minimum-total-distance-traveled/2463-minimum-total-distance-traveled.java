class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        
        List<Integer> slots = new ArrayList<>();

        for(int i = 0; i<factory.length; i++){
            for(int j = 0; j<factory[i][1]; j++){
                slots.add(factory[i][0]);
            }
        }

        Collections.sort(robot);
        Collections.sort(slots);

        long[][] dp = new long[robot.size()+1][slots.size()+1];

        for(long[] rows : dp){
            Arrays.fill(rows,-1);
        }

        long ans = compute(0,0,robot,slots,dp);

        return ans;

    }

    public static long compute(int i,int j,List<Integer> robot,List<Integer> slots,long[][] dp){

        if(i == robot.size()){
            return 0;
        }

        if(j == slots.size()){
            return (long)1e15;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        long skip = compute(i,j+1,robot,slots,dp);
        long take = Math.abs(robot.get(i) - slots.get(j)) + compute(i+1,j+1,robot,slots,dp);

        dp[i][j] = Math.min(skip,take);
        return dp[i][j];


    }

}