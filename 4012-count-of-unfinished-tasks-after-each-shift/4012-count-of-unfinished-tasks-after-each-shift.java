class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        
        long sum = 0;

        long[] arr = new long[tasks.length + 1];
        int index = 1;

        for(int i = tasks.length - 1; i>=0; i--){
            sum += tasks[i];
            arr[index] = arr[index-1] + tasks[i];
            index += 1;
        }

        int[] ans = new int[shifts.length];
        long val = sum;

        for(int i = 0; i<shifts.length; i++){

            if(val - shifts[i] <= 0){
                ans[i] = 0;
                val = sum;
            }
            else{
                val -= shifts[i];

                ans[i] = compute(val,arr);

            }

        }

        return ans;



    }

    public static int compute(long target,long[] arr){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }

        }

        return low;


    }

}