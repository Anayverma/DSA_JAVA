class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> boundary = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];

        // Traverse left and right boundaries
        for (int i = 0; i < m; i++) {
            if (board[i][0] == '0') {
                board[i][0] = '1';
                boundary.add(new int[]{i, 0});
                vis[i][0] = true;
            }
            if (board[i][n - 1] == '0') {
                board[i][n - 1] = '1';
                boundary.add(new int[]{i, n - 1});
                vis[i][n - 1] = true;
            }
        }

        // Traverse top and bottom boundaries
        for (int i = 0; i < n; i++) {
            if (board[m - 1][i] == '0') {
                board[m - 1][i] = '1';
                boundary.add(new int[]{m - 1, i});
                vis[m - 1][i] = true;
            }
            if (board[0][i] == '0') {
                board[0][i] = '1';
                // System.out.println();
                boundary.add(new int[]{0, i});
                vis[0][i] = true;
            }
        }
        System.out.println(boundary);
        // int[] x = {-1, 0, 1, 0};
        // int[] y = {0, 1, 0, -1};
        // while (!boundary.isEmpty()) {
        //     int[] pos = boundary.remove();
        //     for (int j = 0; j < 4; j++) {
        //         int newX = pos[0] + x[j];
        //         int newY = pos[1] + y[j];
        //         if (newX >= 0 && newX < m && newY >= 0 && newY < n && board[newX][newY] == '0' && !vis[newX][newY]) {
        //             vis[newX][newY] = true;
        //             boundary.add(new int[]{newX, newY});
        //             board[newX][newY] = '1';
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         board[i][j] = board[i][j] == '1' ? '0' : 'X';
        //     }
        // }
    }
}
