class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        
        int c = 0;

        int evens = 0;
        int odds = 0;

        for(int i = 0; i<nums.length; i++){
            evens = 0;
            odds = 0;
            for(int j = i; j<nums.length; j++){
                if(nums[j]%2 == 0){
                    evens += 1;
                }
                else{
                    odds += 1;
                }

                if(odds != 0 && (double)evens/odds <= (double)a/b){
                    c += 1;
                }

            }
        }

        return c;


    }
}