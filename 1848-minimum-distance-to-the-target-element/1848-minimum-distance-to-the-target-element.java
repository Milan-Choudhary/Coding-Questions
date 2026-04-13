class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        
        int ans = 1001;
        int right = start + 1;
        int left = start;

        while(right < nums.length){
            if(target == nums[right]){
                ans = Math.min(ans,Math.abs(start - right));
                break;
            }

            right += 1;
        }

        while(left >= 0){
            if(target == nums[left]){
                ans = Math.min(ans,Math.abs(start - left));
                break;
            }

            left -= 1;
        }

        return ans;


    }
}