class Solution {
    public String processStr(String s) {
        
        StringBuilder res = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(res.length() > 0){
                    res.setLength(res.length()-1);
                }
            }
            else if(ch == '#'){
                res.append(res);
            }
            else if(ch == '%'){
                res.reverse();
            }
            else{
                res.append(ch);
            }


        }

        return res.toString();


    }
}