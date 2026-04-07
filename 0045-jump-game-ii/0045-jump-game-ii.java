class Solution {
    public int jump(int[] nums) {

        if(nums.length == 1){
            return 0;
        }

        int max_ele = 0;
        int i = 0;
        int index = 0;
        int jumps = 0;

        while(i < nums.length){
            if(i + nums[i] >= nums.length - 1){
                jumps += 1;
                break;
            }

            max_ele = 0;
            int j = i + 1;
            while(j < nums.length && j<=nums[i] + i){
                if(nums[j] + j >= max_ele){
                    max_ele = nums[j] + j;
                    index = j;
                }
                j += 1;
            }

            i = index;
            jumps += 1;
           

            if(index >= nums.length - 1){
                break;
            }

        }

        return jumps;

    }     
}