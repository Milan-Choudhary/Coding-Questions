class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i<nums.size(); i++){
            int val = 0;
            for(int j = i; j<nums.size(); j++){
                val += nums.get(j);

                int len = j - i + 1;

                if(len <= r && len >= l && val > 0){
                    sum = Math.min(sum,val);
                }

            }
        }

        return sum == Integer.MAX_VALUE ? -1 : sum;

    }
}