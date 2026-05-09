class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int left = 0;
        int c = 0;
        int add = 0;
        int check = 0;
        int ahead = 0;
        
        for(int i = 0; i<nums.length; i++){

            if(nums[i]%2 != 0){
                check += 1;
            }

            while(left < nums.length && check > k){
                c += add;
                if(nums[left]%2 != 0){
                    check -= 1;
                }

                left += 1;

            }

            if(c > ahead){
                add = 0;
                ahead = c;
            }

            if(check == k){
                add += 1;
            }

            

        }

        while(left < nums.length && check == k){
                c += add;
                if(nums[left]%2 != 0){
                    check -= 1;
                }

                left += 1;
            }

        return c;
        
    }
}