class Solution {
    public int splitArray(int[] nums, int k) {
        
        int sum = 0;
        int ans = 0;

        for(int num : nums){
            sum += num;
        }

        ans = sum;

        int left = 0;
        int right = sum;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(canAdd(mid,nums,k) == true){
                ans = Math.min(ans,mid);
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }


        }

        return ans;

    }

    public static boolean canAdd(int range,int[] arr,int k){

        int val = 0;
        int index = 0;
        int c = 1;

        while(index < arr.length){
            
            if(val + arr[index] <= range){
                val += arr[index];
            }
            else{
                if(arr[index] > range){
                    return false;
                }

                 c += 1;
                val = arr[index];

            }

            if(c > k){
                return false;
            }

            index += 1;


        }

        return c <= k;


    }


}