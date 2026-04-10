class Solution {
    public int minimumDistance(int[] nums) {
        
        int val = 0;
        int index1 = 0;
        int index2 = 0;
        int distance = Integer.MAX_VALUE;

        for(int i = 0; i <=nums.length - 3; i++){
            val = nums[i];
            for(int j = i + 1; j<=nums.length - 2; j++){
                if(nums[j] == val){
                   for(int k = j + 1; k<=nums.length - 1; k++){
                    if(nums[k] == val){
                        int dis = Math.abs(i-j) + Math.abs(i-k) + Math.abs(j-k);
                        distance = Math.min(dis,distance);
                    }
                 }
                }              
            }
        }

        distance = distance == Integer.MAX_VALUE ? -1 : distance;

        return distance;

    }
}