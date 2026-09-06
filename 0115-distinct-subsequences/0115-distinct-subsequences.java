class Solution {
    public int numDistinct(String s, String t) {
        
        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = compute(s,t,0,0,dp);

        return ans;


    }

    public static int compute(String ans,String t,int i,int j,int[][] dp){
        if(j == t.length()){
            return 1;
        }


        if(i >= ans.length()){
            return 0;
        }

        

        if(dp[i][j] != -1){
            return dp[i][j];
        }


        int take = 0;
        if(ans.charAt(i) == t.charAt(j)){
            take = compute(ans,t,i+1,j+1,dp);
        }

        int skip = compute(ans,t,i+1,j,dp);
        
        dp[i][j] = skip + take;

        return dp[i][j];

    }

}