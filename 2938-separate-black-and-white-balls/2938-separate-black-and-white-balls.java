class Solution {
    public long minimumSteps(String s) {
        long cur=s.length()-1;
        long r=s.length()-1;
        long swap=0;
        while(cur>=0){
            if(s.charAt((int)cur)=='1'){
                swap+=r-cur;
                r--;
            }
            cur--;
        }
        return swap;
    }
}