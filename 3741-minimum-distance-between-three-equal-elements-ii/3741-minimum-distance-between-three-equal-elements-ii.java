class Solution {
    public int minimumDistance(int[] nums) {
        
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
               map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
            
            if(map.get(nums[i]).size() == 3){
                ArrayList<Integer> list = map.get(nums[i]);
                int sum = 2*(Math.abs(list.get(0) - list.get(1)) + Math.abs(list.get(1) - list.get(2)));
                ans = Math.min(ans,sum);

                map.get(nums[i]).remove(0);
            }

        }

        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        return ans;

    }
}