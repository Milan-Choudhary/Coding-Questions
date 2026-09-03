class Solution {
    public boolean uniformArray(int[] nums1) {
        
        PriorityQueue<Integer> for_even = new PriorityQueue<>((a,b) -> b - a);
        int min_odd = Integer.MAX_VALUE;
        int even = 0;

        for(int i = 0; i<nums1.length; i++){
            if(nums1[i]%2 != 0){
                min_odd = Math.min(min_odd,nums1[i]);
            }
            else{
                even += 1;
                for_even.add(nums1[i]);
            }
        }


        while(for_even.size() > 0 && min_odd != Integer.MAX_VALUE){
            int val = for_even.poll();
            if(val < min_odd){
                return false;
            }
        }

        return true;


    }
}