class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        long ans = 0;

        int right = 0;
        int c = 0;

        while(right < nums.length){

            if(nums[right] < minK || nums[right] > maxK){

                int val = 0;
                int num = 0;

                if(c%2 == 0){
                    val = c/2;
                    num = c + 1;
                }
                else{
                    val = (c+1)/2;
                    num = c;
                }

                ans += (long)val*num;
                c = 0;

            }
            else{
                c += 1;
            }

            right += 1;

        }

        if(c != 0){
                int val = 0;
                int num = 0;

                if(c%2 == 0){
                    val = c/2;
                    num = c + 1;
                }
                else{
                    val = (c+1)/2;
                    num = c;
                }

                ans += (long)val*num;
        }
        

        return ans;


    }
}