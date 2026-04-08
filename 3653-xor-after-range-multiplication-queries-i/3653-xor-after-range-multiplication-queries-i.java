class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        
        int modulo = 1000_000_007;

        int index = 0;

        for(int[] cell : queries){
            
            int l = cell[0];
            int r = cell[1];
            int k = cell[2];
            int v = cell[3];

            index = l;

            while(index <= r){
                long val = 1L * nums[index]*v;
                int value = (int)(val%modulo);
                nums[index] = value;
                index += k;
            }

        }

        int xor = nums[0];

        for(int i = 1; i<nums.length; i++){
            xor ^= nums[i];
        }

        return xor;

    }
}