class Solution {
    public int countSpecialIntegers(int[] nums) {
        
        int[][] freq = new int[101][3];

        for(int i = 0; i<101; i++){
            for(int j = 1; j<3; j++){
                freq[i][j] = -1;
            }
        }


        for(int i = 0; i<nums.length; i++){

            freq[nums[i]][0] += 1;

            if(freq[nums[i]][1] == -1){
                freq[nums[i]][1] = i;
            }
            else{
                freq[nums[i]][2] = i;
            }

        }

        int count = 0;

        for(int[] arr : freq){

            int terms = arr[0];
            int first_index = arr[1];
            int last_index = arr[2];

            if(last_index == -1){
                last_index = first_index;
            }
            
            if(terms != 0){
            count = terms == last_index - first_index + 1 ? count + 1 : count + 0;
            }

        }

        return count;

    }
}