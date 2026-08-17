class Solution {
    public int minimumEffort(int[][] tasks) {
        
        Arrays.sort(tasks,((a,b) -> (b[1] - a[1]) - (b[0] - a[0])));

        int low = 0;
        int high = 1000_000_000;

        int ans = 0;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(isPossible(mid,tasks)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return ans;


    }

    public static boolean isPossible(int energy,int[][] tasks){

        for(int[] arr : tasks){
            if(energy < arr[1]){
                return false;
            }

            energy -= arr[0];
        }

        return true;

    }


}