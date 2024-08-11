class Solution {
    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper(board, i, j, word, 0);
                if (flag) return true;
            }
        }

        return false;
    }

    public void helper(char[][] board, int i, int j, String word, int index) {
        if (flag) return; // Stop further exploration if the word is already found
        if (index == word.length()) {
            flag = true;
            return;
        }

        // Check bounds and if the current cell matches the current character in the word
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return;
        }

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '*';

        // Explore in all 4 possible directions
        helper(board, i + 1, j, word, index + 1); // Down
        helper(board, i - 1, j, word, index + 1); // Up
        helper(board, i, j + 1, word, index + 1); // Right
        helper(board, i, j - 1, word, index + 1); // Left

        // Backtrack by unmarking the cell
        board[i][j] = temp;
    }
}
