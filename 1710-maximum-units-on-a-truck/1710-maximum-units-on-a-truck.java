class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);

        int ans = 0;
        for(int[] cell : boxTypes){
            int box = cell[0];
            int p = cell[1];

            if(truckSize >= box){
                truckSize -= box;
                ans += box*p;
            }
            else{
                ans += truckSize*p;
                truckSize = 0;
            }

            if(truckSize == 0){
                break;
            }
        }

        return ans;

    }
}