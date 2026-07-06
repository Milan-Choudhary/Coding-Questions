class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        int count = 0;
        int index = 0;

        for(int[] arr : intervals){
            int a = arr[0];
            int b = arr[1];
        for(int i = 0; i<intervals.length; i++){
            if(i == index){
                continue;
            }
            int c = intervals[i][0];
            int d = intervals[i][1];

            if(c <= a && b <= d){
                count += 1;
                break;
            }
            
        }
            index += 1;
        }

        return intervals.length - count;

    }
}