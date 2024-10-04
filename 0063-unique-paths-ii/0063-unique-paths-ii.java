class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        if(m==n && m==1) return 1; 
        obstacleGrid[0][0]=obstacleGrid[0][0]==1?0:1;
        for(int i=1;i<m;i++)  obstacleGrid[i][0]=obstacleGrid[i][0]==1?0:obstacleGrid[i-1][0];
        for(int i=1;i<n;i++)  obstacleGrid[0][i]=obstacleGrid[0][i]==1?0:obstacleGrid[0][i-1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(obstacleGrid[i][j]+"\t");}
              System.out.println();
        }
              System.out.println();
              System.out.println();
              System.out.println();

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1)      obstacleGrid[i][j]=0;
                else obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(obstacleGrid[i][j]+"\t");}
              System.out.println();
        }
        return obstacleGrid[m-1][n-1];
    }
}