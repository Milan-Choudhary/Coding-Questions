class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[i] = Math.abs(nums[i]);
            }
        }

        Arrays.sort(nums);

        long ans = 0;

        int left = 0;

        if(nums.length%2 == 0){
            while(left < nums.length/2){

            ans = ans - nums[left]*nums[left];
            left += 1;
            
            }
            while(left < nums.length){
                ans = ans + nums[left]*nums[left];
                 left += 1;
            
            }


        }
        else{
             while(left < nums.length/2){

            ans = ans - nums[left]*nums[left];
            left += 1;
            
            }
            while(left < nums.length){
                ans = ans + nums[left]*nums[left];
                 left += 1;
            
            }


        }

        
        return ans;


    }
}