class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0){
        return 0;
       }

       if(nums.length == 1){
        return 1;
       }

       Arrays.sort(nums);
       int c = 1;
       int ans = 0;

       int num = nums[0];

       for(int i = 1; i<nums.length; i++){

        if(nums[i] - num == 1){
            c += 1;
            num = nums[i];
        }
        else if(nums[i] == num){
            num = nums[i];
        }
        else{
            num = nums[i];
            c = 1;
        }

        ans = Math.max(ans,c);

       }

        return ans;

    }
}