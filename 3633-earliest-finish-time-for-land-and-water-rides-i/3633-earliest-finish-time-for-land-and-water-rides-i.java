class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int duration = 0;
        int min_duration = Integer.MAX_VALUE;

        for(int i = 0; i<landStartTime.length; i++){
            duration = landStartTime[i] + landDuration[i];

            for(int j = 0; j<waterStartTime.length; j++){
                
                if(waterStartTime[j] <= duration){
                    min_duration = Math.min(duration + waterDuration[j],min_duration);
                }
                else{
                    min_duration = Math.min(min_duration,waterDuration[j] + waterStartTime[j]);
                }

            }
        }


        for(int i = 0; i<waterStartTime.length; i++){
            duration = waterStartTime[i] + waterDuration[i];

            for(int j = 0; j<landStartTime.length; j++){

                if(landStartTime[j] <= duration){
                    min_duration = Math.min(duration + landDuration[j],min_duration);
                }
                else{
                    min_duration = Math.min(min_duration,landDuration[j] + landStartTime[j]);
                }

            }
        }


        return min_duration;


    }
}