class Solution {
    public int findMin(int[] nums) {
        //Not the best to do
        Arrays.sort(nums);
        return nums[0];

    }
}