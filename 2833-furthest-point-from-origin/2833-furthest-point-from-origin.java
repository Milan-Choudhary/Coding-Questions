class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int left = 0;
        int right = 0;
        int n = moves.length();

        for(int i = 0; i<moves.length();  i++){
            if(moves.charAt(i) == 'R'){
                right += 1;
            }
            else if(moves.charAt(i) == 'L'){
                left += 1;
            }
        }

        if(left == right){
            return n - (left + right);
        }        

        int val = Math.max(left,right);
        val = val - Math.min(left,right);

        return n + val - (left + right);

    }
}