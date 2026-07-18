class Solution {
    public int findGCD(int[] nums) {
        int greater = 0;
        int shorter = 1001;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < shorter){
                shorter = nums[i];
            }

            if(nums[i] > greater){
                greater = nums[i];
            }
        }


        int ans = gcd(greater,shorter);
        return ans;
    }

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }

        return gcd(b,a%b);
    }
}