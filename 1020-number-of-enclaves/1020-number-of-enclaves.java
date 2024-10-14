class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> boundary = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        int count=0;

        // Traverse left and right boundaries
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                grid[i][0] = 2;
                boundary.add(new int[]{i, 0});
                vis[i][0] = true;
            }
            if (grid[i][n - 1] == 1) {
                grid[i][n - 1] = 2;
                boundary.add(new int[]{i, n - 1});
                vis[i][n - 1] = true;
            }
        }

        // Traverse top and bottom boundaries
        for (int i = 0; i < n; i++) {
            if (grid[m - 1][i] == 1) {
                grid[m - 1][i] = 2;
                boundary.add(new int[]{m - 1, i});
                vis[m - 1][i] = true;
            }
            if (grid[0][i] == 1) {
                grid[0][i] = 2;
                boundary.add(new int[]{0, i});
                vis[0][i] = true;
            }
        }
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};
        while (!boundary.isEmpty()) {
            int[] pos = boundary.remove();
            for (int j = 0; j < 4; j++) {
                int newX = pos[0] + x[j];
                int newY = pos[1] + y[j];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1 && !vis[newX][newY]) {
                    vis[newX][newY] = true;
                    boundary.add(new int[]{newX, newY});
                    grid[newX][newY] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1) count++;
            }
        }
        return count;
    }
}