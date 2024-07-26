class Solution {
    List<List<String>> result = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        char[][] cb = new char[n][n]; // chessboard
        
        // Initialize chessboard with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cb[i][j] = '.';
            }
        }
        
        helper(n, 0, cb);
        
        return result;
    }
    
    public boolean isSafe(int n, int row, int col,char [][] cb) {
        // Check column on this row
        for (int i = 0; i < col; i++) {
            if (cb[row][i] == 'Q') {
                return false;
            }
        }
        
        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (cb[i][j] == 'Q') {
                return false;
            }
        }
        
        // Check lower left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (cb[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }
    
    public void helper(int n, int col,  char[][] cb) {
        if (col == n) {
            // Found a solution, add to result
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(String.valueOf(cb[i]));
            }
            result.add(solution);
            return;
        }
        
        for (int i = 0; i < n; i++) 
            if (isSafe(n, i, col,cb)) {
                cb[i][col] = 'Q'; // Place Queen
                
                helper(n, col + 1, cb);
                
                cb[i][col] = '.'; // Backtrack
        }
    }

}
