class Solution {
    public void sortColors(int[] nums) {
        
        int red = 0;
        int white = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                red += 1;
            }
            else if(nums[i] == 1){
                white += 1;
            }
            
        }

        white += red;

        int index = 0;

        while(index < nums.length){

            int right = nums.length - 1;

            if(index < red && nums[index] != 0){

                while(nums[right] != 0){
                    right -= 1;
                }

                int temp = nums[index];
                nums[index] = nums[right];
                nums[right] = temp;

            }
            else if(index >= red && index < white && nums[index] != 1){

                while(nums[right] != 1){
                    right -= 1;
                }

                int temp = nums[index];
                nums[index] = nums[right];
                nums[right] = temp;

            }

            index += 1;

        }



    }
}