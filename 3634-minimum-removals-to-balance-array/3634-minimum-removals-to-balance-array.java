class Solution {
    public int minRemoval(int[] nums, int k) {
        
        Arrays.sort(nums);

        int left = 0;
        int ans = nums.length + 1;
        
        while(left < nums.length){
            long val = 1L*nums[left]*k;
            
            int right = compute(val,left,nums.length - 1,nums);

            ans = Math.min(ans,nums.length - (right - left + 1));

            if(ans == 1){
                return ans;
            }

            left += 1;

        }

        return ans;


    }

    public static int compute(long target,int start,int end,int[] nums){
        
        int ans = 0;
        while(start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] <= target){
                ans = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            

        }

        return ans;

    }

}