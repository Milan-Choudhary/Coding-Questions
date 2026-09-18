class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int required = nums.length/3;

        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 0;

        for(int num : nums){

            if(candidate1 == num){
                c1 += 1;
            }
            else if(candidate2 == num){
                c2 += 1;
            }
            else if(candidate1 == Integer.MIN_VALUE){
                candidate1 = num;
                c1 += 1;
            }
            else if(candidate2 == Integer.MIN_VALUE){
                candidate2 = num;
                c2 += 1;
            }
            else{
                c1 -= 1;
                c2 -= 1;

                if(c1 == 0){
                    candidate1 = Integer.MIN_VALUE;
                }

                if(c2 == 0){
                    candidate2 = Integer.MIN_VALUE;
                }


            }

        }

        c1 = 0;
        c2 = 0;

        for(int num : nums){
            if(candidate1 == num){
                c1 += 1;
            }
            if(candidate2 == num){
                c2 += 1;
            }
        }

        List<Integer> res = new ArrayList<>();

        if(required < c1){
            res.add(candidate1);
        }

        if(required < c2){
            res.add(candidate2);
        }

        return res;


    }
}