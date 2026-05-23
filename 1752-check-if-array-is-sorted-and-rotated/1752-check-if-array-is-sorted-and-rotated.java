class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int ele = 101;
        int index = -1;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] < ele){
                ele = nums[i];
                index = i;
            }
        }

        int terms = nums.length - 1;

        if(index == 0){            
            while(terms > 0 && nums[terms] == ele){
                terms -= 1;
            }
        }        

        while(terms > 0){
            
            index += 1;            
            if(nums[index%n] < ele){
                return false;
            }

            ele = nums[index%n];
            terms -= 1;

        }

        return true;

    }
}