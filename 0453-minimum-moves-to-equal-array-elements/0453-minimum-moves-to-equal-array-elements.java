class Solution {
    public int minMoves(int[] nums) {

        int moves = 0;

        int min_ele = nums[0];

        for(int i = 1; i<nums.length; i++){
            min_ele = Math.min(min_ele,nums[i]);
        }

        for(int num : nums){
            moves += num - min_ele;
        }

        return moves;
        
    }
}