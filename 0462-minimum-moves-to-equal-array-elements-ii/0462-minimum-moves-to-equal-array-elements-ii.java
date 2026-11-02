class Solution {
    public int minMoves2(int[] nums) {
        
        int ans = 0;

        Arrays.sort(nums);

        int l = nums.length;
        int value = 0;

        if(l%2 != 0){
            value = nums[l/2];

            for(int num : nums){

                ans += Math.abs(value - num);

            }
        }
        else{

            int index1 = l/2-1;
            int index2 = l/2;

            value = (nums[index1] + nums[index2])/2;

             for(int num : nums){

                ans += Math.abs(value - num);

            }

        }

        return ans;

    }
}