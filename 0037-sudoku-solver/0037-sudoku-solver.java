class Solution {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }

    public boolean backtracking(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char ch='1';ch<='9';ch++){
                       if(isValid(board,ch,row,col)==true){
                            board[row][col]=ch;
                            if(backtracking(board)==true)
                                return true;
                            board[row][col]='.';
                       }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, char num, int row, int col){
        //row checking && column checking
        for(int i=0;i<9;i++){
            if(board[row][i]==num || board[i][col]==num)
                return false;
        }
        //grid checking
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[r+i][c+j]==num)
                    return false;
            }
        }
        return true;
    }
}