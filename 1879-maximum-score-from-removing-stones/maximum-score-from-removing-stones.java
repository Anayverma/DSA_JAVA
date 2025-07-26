class Solution {
    public int maximumScore(int a, int b, int c) {
        ArrayList<Integer> ar=new ArrayList<>(List.of(a,b,c));
        Collections.sort(ar);
        int res=0;
        while(ar.get(1)!=0){
            res++;
            ar.set(2,ar.get(2)-1);
            ar.set(1,ar.get(1)-1);
            Collections.sort(ar);
        }
        return res;
    }
}