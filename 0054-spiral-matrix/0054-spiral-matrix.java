class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int start = 0;
        int end = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
       

        while(start <= end && top <= bottom){

            for(int i = start; i<=end; i++){
                res.add(matrix[top][i]);
            }
            top += 1;
            if(top > bottom){
                break;
            }

            for(int i = top; i<=bottom; i++){
                res.add(matrix[i][end]);
            }
            end -= 1;

            if(start > end){
                break;
            }

            for(int i = end; i>=start; i--){
                res.add(matrix[bottom][i]);
            }
            bottom -= 1;

            for(int i = bottom; i>= top; i--){
                res.add(matrix[i][start]);
            }
            start += 1;
           
        }
       
       return res;

    }
}