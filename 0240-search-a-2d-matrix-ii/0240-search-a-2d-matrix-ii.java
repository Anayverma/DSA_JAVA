class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if( target > matrix[i][matrix[i].length-1] || target < matrix[i][0]) continue;
            if(isFound(matrix,i,target)) return true;
       }
    //    System.gc();
       return false;
    }
    public boolean isFound(int [][] matrix,int i,int t){
        int l=0, h=matrix[i].length-1;
        while(l<=h){
        int mid=l+h;
        mid=mid/2;
        if(matrix[i][mid]==t) return true;
        else if (matrix[i][mid] < t) l=mid+1;
        else h=mid-1;
        }
        return false;
    }
}