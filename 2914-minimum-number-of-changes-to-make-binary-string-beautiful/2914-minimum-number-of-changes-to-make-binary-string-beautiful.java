class Solution {
    public int minChanges(String s) {
        
        int zeros = 0;
        int ones = 0;
        int count = 0;

        int ans = 0;

        for(int k = 0; k<s.length(); k+=2){

            int val = k;

            while(val < k + 2){
                if(s.charAt(val) == '0'){
                    zeros += 1;
                }
                else{
                    ones += 1;
                }
                val += 1;
            }

            ans += Math.min(zeros,ones);
            zeros = 0;
            ones = 0;

        }

        // int i = 1;

        // while(i < s.length() && s.charAt(i) == s.charAt(i-1)){
        //     i += 1;
        // }

        // if(i == s.length()){
        //     return 0;
        // }

        // if(i%2 != 0){
        //     count += 1;
        //     i += 1;
        //     while(i < s.length()){
        //         if(s.charAt(i) == '0'){
        //             zeros += 1;
        //         }
        //         else{
        //             ones += 1;
        //         }

        //         i += 1;
        //     }

        // }
        // else{

        //     while(i < s.length()){
        //         if(s.charAt(i) == '0'){
        //             zeros += 1;
        //         }
        //         else{
        //             ones += 1;
        //         }

        //         i += 1;
        //     }



        // }

        // return Math.min(zeros,ones) + count;

        return ans;


    }
}