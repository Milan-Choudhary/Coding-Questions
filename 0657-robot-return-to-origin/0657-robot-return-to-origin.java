class Solution {
    public boolean judgeCircle(String moves) {
        int a = 0;
        int b = 0;

        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                a += 1;
            }
            else if(moves.charAt(i) == 'D'){
                a -= 1;
            }
            else if(moves.charAt(i) == 'L'){
                b += 1;
            }
            else{
                b -= 1;
            }

        }

       return a==0 && b == 0;

    }
}