class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;int n=grid[0].length;
        int [][] dpHaiBhao=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dpHaiBhao[i],-1);
        return helper(grid,dpHaiBhao,m-1,n-1);        
    }
    public int helper(int [][] grid ,int [][] dpHaiBhao,int i,int j){
         if(i==0&&j==0) return grid[0][0];
         if(i<0||j<0) return Integer.MAX_VALUE;
         if(dpHaiBhao[i][j]!=-1) return dpHaiBhao[i][j];
         dpHaiBhao[i][j]=grid[i][j]+Math.min(helper(grid,dpHaiBhao,i-1,j),helper(grid,dpHaiBhao,i,j-1));
         return dpHaiBhao[i][j];
    }
}