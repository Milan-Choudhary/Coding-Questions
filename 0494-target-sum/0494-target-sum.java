class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int ans = compute(nums,target,0,0);

        return ans;

    }

    public static int compute(int[] nums,int t,int val,int i){
        if(i > nums.length){
            return 0;
        }

        if(i == nums.length){
            if(t == val){
                return 1;
            }
            return 0;
        }

        int add = compute(nums,t,val + nums[i],i+1);
        int minus = compute(nums,t,val - nums[i],i+1);

        return add + minus;

    }
}