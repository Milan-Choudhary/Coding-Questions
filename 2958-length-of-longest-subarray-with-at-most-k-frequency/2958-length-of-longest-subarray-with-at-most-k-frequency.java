class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        int len = 0;

        while(right < nums.length){

            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(left < nums.length && map.get(nums[right]) > k){
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }

                left += 1;
            }

            len = Math.max(right-left+1,len);

            right += 1;

        }

        return len;


    }
}