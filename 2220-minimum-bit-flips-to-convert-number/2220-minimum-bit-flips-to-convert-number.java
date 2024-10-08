class Solution {
    public int minBitFlips(int start, int goal) {
        int max=Math.max(start,goal);
        int min=Math.min(start,goal);
        int res=0;
        while(max>0){
            res+=(max&1)==(min&1)?0:1;
            max=max>>1;
            min=min>>1;
        }
        return res;
    }
}