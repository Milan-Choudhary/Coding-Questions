class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int[] freq = new int[51];

        int left = 0;
        int right = 0;

        HashSet<Integer> set = new HashSet<>();

        while(right < k){

            if(!set.contains(nums[right])){
                freq[nums[right]] += 1;
            
            }

            set.add(nums[right]);
            right += 1;
        }

        left += 1;
        set.clear();

        while(right < nums.length){
            int val = left;
            while(left <= right){

                if(!set.contains(nums[left])){
                    freq[nums[left]] += 1;

                }
                
                set.add(nums[left]);
                left += 1;
               
            }

            set.clear();
            left = val;
            left += 1;
            right += 1;

        }

        int ans = -1;

        for(int i = 0; i<51; i++){
            if(freq[i] == 1){
                ans = Math.max(ans,i);
            }
        }

        return ans;


    }
}