class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length <= 2){
            return nums[nums.length - 1];
        }

        Arrays.sort(nums);

        int ele = nums[nums.length - 1];

        int left = nums.length - 2;
        int c = 0;

        while(left >= 0){
            if(ele > nums[left]){
                ele = nums[left];
                c += 1;
            }

            left -= 1;
            if(c == 2){
                break;
            }
        }

        return ele = c == 2 ? ele : nums[nums.length - 1];
    }
}