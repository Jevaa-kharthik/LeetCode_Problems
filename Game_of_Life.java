public class Game_of_Life {
    class Solution {
        public void gameOfLife(int[][] board) {
            int row = board.length;
            int col = board[0].length;
    
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    int live = neighbouring(board, row-1, col) + neighbouring(board, row-1, col-1) + neighbouring(board, row-1, col + 1) + neighbouring(board, row + 1, col) + neighbouring(board, row + 1, col - 1) + neighbouring(board, row + 1, col + 1) + neighbouring(board, row-1, col - 1) + neighbouring(board, row + 1, col + 1);
    
                    if(board[i][j] == 0){
                        board[i][j] = (live < 2 || live > 3) ? 0 : 1;
                    }else 
                        board[i][j] = (live == 3)? 1 : 0;
                }
            }
        }
        private int neighbouring(int[][] board, int row, int col){
            if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) return 0;
            return 1;
        }
    }
}
