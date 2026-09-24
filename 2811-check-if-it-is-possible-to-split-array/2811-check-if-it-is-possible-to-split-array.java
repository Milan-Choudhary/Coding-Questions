class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        if(nums.size() == 1 || nums.size() == 2){
            return true;
        }

        int k = 2;
        int sum = 0;

        for(int i = 0; i<k; i++){
            sum += nums.get(i);
        }

        if(sum >= m){
            return true;
        }

        for(int i = k; i<nums.size(); i++){
            sum = sum - nums.get(i-k) + nums.get(i);

            if(sum >= m){
                return true;
            }

        }
        
        return false;

    }
}