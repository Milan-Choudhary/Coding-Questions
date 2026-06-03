class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        
        int duration = Integer.MAX_VALUE;
        int min_duration = Integer.MAX_VALUE;

        for(int i = 0; i<lst.length; i++){
            duration = Math.min(lst[i]+ld[i],duration);
        }

        for(int i = 0; i<wst.length; i++){
            if(wst[i] <= duration){
                min_duration = Math.min(duration + wd[i],min_duration);
            }
            else{
                min_duration = Math.min(wd[i] + wst[i],min_duration);
            }
        }

        duration = Integer.MAX_VALUE;

        for(int i = 0; i<wst.length; i++){
            duration = Math.min(wst[i]+wd[i],duration);
        }

        for(int i = 0; i<lst.length; i++){
            if(lst[i] <= duration){
                min_duration = Math.min(duration + ld[i],min_duration);
            }
            else{
                min_duration = Math.min(ld[i] + lst[i],min_duration);
            }
        }


        return min_duration;        


    }
}