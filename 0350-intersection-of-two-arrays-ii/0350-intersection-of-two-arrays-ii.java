class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    ans.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }

        int[] res = new int[ans.size()];

        for(int i = 0; i<res.length; i++){
            res[i] = ans.get(i);
        }

        return res;

    }
}