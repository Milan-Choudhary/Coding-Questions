class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        int c = 0;
        while(c < goal.length()){
            boolean flag = true;
            int k = 0;
            for(int j = c; j<goal.length()+c; j++){
                if(s.charAt(k) != goal.charAt(j%goal.length())){
                    flag = false;
                    break;
                }
                k += 1;
            }

            if(flag == true){
                return true;
            }
            c += 1;
        }

        return false;

    }
}