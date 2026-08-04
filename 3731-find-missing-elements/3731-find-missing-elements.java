class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int val = nums[0] + 1;

        int index = 1;

        while(index < nums.length){

            while(val != nums[index]){
                ans.add(val);
                val += 1;
            }

            index += 1;
            val += 1;
        }

        return ans;

    }
}