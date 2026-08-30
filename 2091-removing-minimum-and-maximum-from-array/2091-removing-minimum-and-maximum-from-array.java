class Solution {
    public int minimumDeletions(int[] nums) {

        int ans = nums.length;

        int min_val = 100001;
        int max_val = -100001;
        int min_index = -1;
        int max_index = -1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min_val){
                min_val = nums[i];
                min_index = i;
            }

            if(nums[i] > max_val){
                max_val = nums[i];
                max_index = i;
            }
            
        }

        int first_way = Math.max(min_index,max_index) + 1;
        int second_way = nums.length - Math.min(min_index,max_index);

        int third_way = Math.min(min_index,max_index) + 1 + nums.length - Math.max(min_index,max_index);

        return Math.min(third_way,Math.min(first_way,second_way));
        

        
    }
}