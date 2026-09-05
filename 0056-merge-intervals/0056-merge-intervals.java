class Solution {

    public int[][] merge(int[][] intervals) {
        
      Arrays.sort(intervals,(a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

      ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int i = 0;
        int j = 0;

     while(i < intervals.length){

        j = i + 1;
        int start = intervals[i][0];
        int end = intervals[i][1];

        while(j < intervals.length && intervals[j][0] <= end){

            if(intervals[j][1] > end){
                end = intervals[j][1];
            }

            j += 1;

        }

        i = j;

        list.add(new ArrayList<>(Arrays.asList(start,end)));


     }

     int[][] ans = new int[list.size()][2];

     for(i = 0; i<list.size(); i++){
        for(j = 0; j<list.get(i).size(); j++){
            ans[i][j] = list.get(i).get(j);
        }
     }

     return ans;

    }
}