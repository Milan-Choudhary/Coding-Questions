class Solution {
    public boolean isPalindromic(String s) {
        
        StringBuilder res = new StringBuilder();

        for(int i = 0; i<s.length(); i++){

            compute(s.charAt(i),res);

        }

        int left = 0;
        int right = res.length() - 1;

        while(left < right){
            if(res.charAt(left) != res.charAt(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }

        return true;

    }

    public static void compute(char ch,StringBuilder res){

        int add = (int)(ch - 'a');
        int val = add + 97;
        StringBuilder ans = new StringBuilder();
        int c = 8;

        while(val > 0){
            int num = val%2;
            ans.append(num);
            val = val/2;
            c -= 1;
        }

        while(c > 0){
            ans.append(0);
            c -= 1;
        }

        ans.reverse();

        res.append(ans);


    }

}