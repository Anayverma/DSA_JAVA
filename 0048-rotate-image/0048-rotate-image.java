class Solution {
    public void rotate(int[][] matrix) {
        int test=10000000;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]=(matrix[i][j]+1000)*2001;

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]+=(matrix[matrix[i].length-1-j][i])/2001;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]=((matrix[i][j])%2001)-1000;
        return ;
    }
}