class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int[] leftmax = new int[arrays.size()];
        int[] rightmax = new int[arrays.size()];

        int curr_max = -10001;       

        for(int i = arrays.size()-1; i>=0; i--){
            rightmax[i] = curr_max;
            int val = arrays.get(i).get(arrays.get(i).size()-1);
            curr_max = Math.max(curr_max,val);
            
        }

         curr_max = -10001;

        System.out.println();

        for(int i = 0; i<arrays.size(); i++){
            leftmax[i] = curr_max;
            int val = arrays.get(i).get(arrays.get(i).size()-1);
            curr_max = Math.max(curr_max,val);
        }

        int ans = 0;

        for(int i = 0; i<arrays.size(); i++){
           
           int val = arrays.get(i).get(0);

           int max_val = Math.max(leftmax[i],rightmax[i]);

           ans = Math.max(ans,Math.abs(max_val - val));

        }

        return ans;


    }
}