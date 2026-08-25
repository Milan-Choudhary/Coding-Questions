class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int i = 1;

        while(set.contains(k*i)){
            i += 1;
        }

        return k*i;

    }
}