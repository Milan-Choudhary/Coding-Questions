class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int k = nums.length - 1;

        prefix[0] = 1;
        suffix[nums.length - 1] = 1;

        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[k-i] = suffix[k-i+1] * nums[k-i+1];
        }

        int[] answer = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
      
    }
}