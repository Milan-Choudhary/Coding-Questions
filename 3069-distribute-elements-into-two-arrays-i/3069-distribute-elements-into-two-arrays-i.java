class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i = 2; i<nums.length; i++){

            int val = nums[i];

            if(list1.get(list1.size()-1) > list2.get(list2.size()-1)){
                list1.add(val);
            }
            else{
                list2.add(val);
            }

        }

        int[] ans = new int[nums.length];

        int index = 0;

        while(index < list1.size()){
            ans[index] = list1.get(index);
            index += 1;
        }

        int idx = 0;
        while(index < nums.length){
            ans[index] = list2.get(idx);
            index += 1;
            idx += 1;
        }

        return ans;
        
    }
}