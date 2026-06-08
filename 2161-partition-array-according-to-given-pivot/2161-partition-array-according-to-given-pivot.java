class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] ans = new int[nums.length];
        
        int left = 0;
        int right = nums.length - 1;
        int l = 0;
        int r = nums.length - 1;

        while(left < nums.length){
            if(nums[left] < pivot){
                ans[l] = nums[left];
                l += 1;
            }

            if(nums[right] > pivot){
                ans[r] = nums[right];
                r -= 1;
            }

            left += 1;
            right -= 1;
        }

        for(int i = l; i<=r; i++){
            ans[i] = pivot;
        }

        return ans;



    }
}