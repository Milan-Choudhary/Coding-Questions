class Solution {
    public int[] productExceptSelf(int[] nums) {

      int[] res = new int[nums.length];  
      int product = 1;
      int count = 0;
      for(int i = 0; i<nums.length; i++){
        if(count > 1){
            break;
        }

        if(nums[i] != 0){
            product *= nums[i];
        }
        else{
            count += 1;
        }
      }

      if(count > 1){
        Arrays.fill(res,0);
      }
      else if(count == 1){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                res[i] = product;
            }
        }

      }
      else{
        for(int i = 0; i<nums.length; i++){
            res[i] = product/nums[i];
        }
      }


      return res;
      
    }
}