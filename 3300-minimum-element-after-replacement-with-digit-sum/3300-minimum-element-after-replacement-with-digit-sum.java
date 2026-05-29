class Solution {
    public int minElement(int[] nums) {
        
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            ans = Math.min(ans,compute(nums[i]));
        }

        return ans;

    }

    public static int compute(int num){

        int sum = 0;

        while(num > 0){
            sum += num%10;
            num = num/10;
        }

        return sum;

    }
}