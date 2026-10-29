class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<9; i++){
            set.clear();

            for(int j = 0; j<9; j++){

                if(set.contains(board[i][j])){
                    return false;
                }

                if(Character.isDigit(board[i][j])){
                    set.add(board[i][j]);
                }

            }
        }



        for(int i = 0; i<9; i++){
            set.clear();

            for(int j = 0; j<9; j++){

                if(set.contains(board[j][i])){
                    return false;
                }

                if(Character.isDigit(board[j][i])){
                    set.add(board[j][i]);
                }

            }
        }

        int row = 0;
        int row_end = 3;
        int col = 0;
        int col_end = 3;
        int moves = 0;
        int store = 0;

        while(row < board.length){
            set.clear();
            while(row < row_end){
                int copy = col;
                while(col < col_end){
                    
                    if(set.contains(board[row][col])){
                        return false;
                    }
                    
                    if(Character.isDigit(board[row][col])){
                        set.add(board[row][col]);
                    }
                    col += 1;
                }

                row += 1;
                col = copy;

            }

            if(row == board.length && col == board[0].length){
                break;
            }

            if(moves == 6){
                moves = 0;
                //row = row + 3;
                store = row;
                row_end = row + 3;
                col = 0;
                col_end = 3;
                continue;
            }

            moves = moves + 3;
            row = store;
            col = moves;
            col_end = col + 3;


        }


        return true;



    }
}