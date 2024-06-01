class Solution {
    public void setZeroes(int[][] matrix) {
        boolean r[]=new boolean[matrix.length];
        boolean c[]=new boolean[matrix[0].length];
        for(int i=0;i<r.length;i++) for(int j=0;j<c.length;j++) if (matrix[i][j]==0) r[i]=c[j]=true;
        for(int i=0;i<r.length;i++) if(r[i]==true) for(int j=0;j<c.length;j++) matrix[i][j]=0;
        for(int j=0;j<c.length;j++) if(c[j]==true) for(int i=0;i<r.length;i++) matrix[i][j]=0;
    }
}