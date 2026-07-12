class Solution {
    public int minimumCost(int[] nums, int k) {
        
        long operations = 0;

        long val = k;
        long check = k;

        for(int i = 0; i<nums.length; i++){
            if(val >= nums[i]){
                val -= nums[i];
            }
            else{
                long diff = 1L*nums[i] - val;
                
                if(diff%check == 0){
                    operations += diff/check;
                    val = 0;
                }
                else{
                    operations += (diff/check) + 1;
                    val = check - (diff%check);                    
                }

            }

        }

        int modulo = 1000_000_007;
        long sum = 0;

        long summation = operations + 1;

        if(operations%2 == 0){
            operations /= 2;
        }
        else{
            summation /= 2;
        }

        long res = ((operations%modulo) * (summation%modulo))%modulo;
        
        return (int)res;


    }
}