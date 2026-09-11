class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        
        if(nums[0] >= nums.length - 1){
            return 1;
        }
        
        int reach = 0;
        int maxnum = -1;

        int i = 0;
        int c = 0;

        while(i < nums.length){

           int j = i + nums[i];
           c += 1;
           int k = 0;

           for(k = i + 1; k<=j; k++){
                if(reach < k + nums[k]){
                    reach = Math.max(reach,k + nums[k]);
                    maxnum = k;
                }
                
                if(reach >= nums.length - 1){
                    return c + 1;
                }
           }

           i = maxnum;

        }       

        return 0;


    }
}