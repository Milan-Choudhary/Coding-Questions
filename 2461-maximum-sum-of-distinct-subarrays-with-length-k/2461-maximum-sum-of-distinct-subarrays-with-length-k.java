class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        long maxsum = 0;
        long sum = 0;

        for(int i = 0; i<k; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum += nums[i];
        }

        if(map.size() == k){
            maxsum = Math.max(maxsum,sum);
        }  

        for(int i = k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            map.put(nums[i-k],map.get(nums[i-k]) - 1);

            if(map.get(nums[i-k]) == 0){
                map.remove(nums[i-k]);
            }

            if(map.size() == k){
                maxsum = Math.max(sum,maxsum);
            }

        }   

        return maxsum;  


    }
}