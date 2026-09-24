class Solution {
    public int smallestIndex(int[] nums) {
        
        int ans = -1;

        for(int i = 0; i<nums.length; i++){
            int sum = compute(nums[i]);
            if(sum == i){
                return i;
            }
        }

        return ans;
    }

    public static int compute(int num){

        int add = 0;

        while(num > 0){
            add += num%10;
            num = num/10;

        }

        return add;

    }

}