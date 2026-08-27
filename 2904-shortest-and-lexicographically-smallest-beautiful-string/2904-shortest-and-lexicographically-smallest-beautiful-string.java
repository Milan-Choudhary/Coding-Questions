class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int len = 101;

        int left = 0;
        int right = 0;
        int c = 0;

        StringBuilder res = new StringBuilder();
        StringBuilder ans = new StringBuilder();


        while(right < s.length()){

            res.append(s.charAt(right));

            if(s.charAt(right) == '1'){
                c += 1;
            }

            while(c == k){
                if(res.length() < len){
                    len = res.length();
                    ans.delete(0,ans.length());
                    ans.append(res);
                }

                if(res.length() == len){

                    for(int i = 0; i<res.length(); i++){
                        if(res.charAt(i) < ans.charAt(i)){
                            ans.delete(0,ans.length());
                            ans.append(res);
                            break;
                        }
                        else if(ans.charAt(i) < res.charAt(i)){
                            break;
                        }
                    }

                }

                if(s.charAt(left) == '1'){
                    c -= 1;
                }

                res.delete(0,1);
                left += 1;

            }

            right += 1;

        }


        return ans.toString();


    }
}