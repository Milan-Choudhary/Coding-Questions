class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k){

            int j = 0;
            int mark = 0;
            int sum = 0;
            String val = "";

            while(j < s.length()){

                if(mark == k){
                    val += Integer.toString(sum);
                    sum = 0;
                    mark = 0;

                }

                sum += Integer.parseInt(Character.toString(s.charAt(j)));
               
                mark += 1;
                j += 1;
            }

            val += Integer.toString(sum);

            s = val;


        }

        return s;



    }
}