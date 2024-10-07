class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=-31;i<31;i++) 
        if(n==(int)Math.pow(2,i)) return true;
        return false;
    }
}