class Solution {
    public int shipWithinDays(int[] weights, int days) {
        

        int sum = 0;
        int low = 0;
        int ans = 500*50000;

        for(int num : weights){
            sum += num;
            low = Math.max(low,num);
        }

        int left = low;
        int right = sum;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(CanShip(weights,days,mid)){
                ans = Math.min(ans,mid);
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }


        }

        return ans;


    }

    public static boolean CanShip(int[] weights,int days,int range){

        int val = 0;
        int index = 0;
        int c = 1;

        while(index < weights.length){

            if(val + weights[index] <= range){
                val += weights[index];
            }
            else{
                val = weights[index];
                c += 1;
            }

            if(c > days){
                return false;
            }

            index += 1;

        }

        return true;

    }

}