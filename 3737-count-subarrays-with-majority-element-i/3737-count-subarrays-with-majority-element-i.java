class Solution {

    public int countMajoritySubarrays(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i; j < nums.length; j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.containsKey(target)){
                    if(map.get(target) > (j - i + 1)/2){
                        c += 1;
                    }
                }

            }

            map.clear();
            
        }

        return c;
       
        
    }
    
}