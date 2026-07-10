class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.'){
                    if(isValid(board,row,col)==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board,int row, int col){
        //row checking
        for(int i=0;i<9;i++){
            if(col!=i && board[row][col]==board[row][i])
                return false;
        }
        //column checking
        for(int i=0;i<9;i++){
            if(row!=i && board[row][col]==board[i][col])
                return false;
        }
        //grid checking
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((row!=r+i && col!=c+j) && board[row][col]==board[r+i][c+j])
                    return false;
            }
        }
        return true;
    }
}