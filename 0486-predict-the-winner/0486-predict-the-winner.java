class Solution {
    public boolean predictTheWinner(int[] nums) {
        int val = find(nums,0,nums.length-1);
        
        return val >= 0;
    }

    public static int find(int[] nums,int i,int j){
        if(i > j){
            return 0;
        }

        int take = nums[i] - find(nums,i+1,j);
        int take2 = nums[j] - find(nums,i,j-1);

        return Math.max(take,take2);
    }
}