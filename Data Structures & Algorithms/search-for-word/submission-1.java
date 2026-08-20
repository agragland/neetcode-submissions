class Solution {
    private int ROWS,COLS;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                if(dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {     
        //use i to keep track if we have a valid path
        if(i == word.length()) return true;

        //if r/c are out of bounds OR the current cell does not match
        //the current string i OR we've visited this cell
        if(r < 0 || c < 0 || r >= ROWS || c >= COLS ||
            board[r][c] != word.charAt(i) || visited[r][c]) {
                return false;
            }

        visited[r][c] = true;
        boolean res = dfs(board, word, r + 1, c, i + 1) ||
                        dfs(board, word, r - 1, c, i + 1) ||
                        dfs(board, word, r, c + 1, i + 1) ||
                        dfs(board, word, r, c - 1, i + 1);
        visited[r][c] = false; //backtrack
        return res;

    }
}
