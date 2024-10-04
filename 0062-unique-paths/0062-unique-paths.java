// class Solution {
//     public int uniquePaths(int m, int n) {
//         int matrix[][]=new int[m][n];
//         for(int i=0;i<m;i++)    matrix[i][0]=1;
//         Arrays.fill(matrix[0],1);

//         for(int i=1;i<m;i++)
//             for(int j=1;j<n;j++)
//                 matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
//         return matrix[m-1][n-1];
//     }
// }
import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];  // No need for dp[m+1][n+1]
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return pathFinder(m - 1, n - 1, dp);  // Adjusted the starting indices
    }

    public int pathFinder(int m, int n, int[][] dp) {
        // If we reach the first row or the first column
        if (m == 0 || n == 0) return 1;

        // Return already computed value
        if (dp[m][n] != -1) return dp[m][n];

        // Compute the number of unique paths
        return dp[m][n] = pathFinder(m - 1, n, dp) + pathFinder(m, n - 1, dp);
    }
}
