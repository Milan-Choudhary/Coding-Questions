class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        
        int[] ans = new int[seq.length()];

        int i = 0;

        boolean flag = true;
        boolean val = true;


        while(i < seq.length()){

            if(seq.charAt(i) == '('){

                if(flag){
                    ans[i] = 0;
                    flag = false;
                }
                else{
                    ans[i] = 1;
                    flag = true;
                }

            }
            else{

                if(val){
                    ans[i] = 0;
                    val = false;
                }
                else{
                    ans[i] = 1;
                    val = true;
                }

            }

            i += 1;

        }

        return ans;


    }
}