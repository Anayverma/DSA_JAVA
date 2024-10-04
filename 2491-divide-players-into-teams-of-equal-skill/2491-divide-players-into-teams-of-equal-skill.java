class Solution {
    public long dividePlayers(int[] skills) {
        Arrays.sort(skills);
        int j=skills.length-2,i=1;
        int diff=skills[j+1]+skills[i-1];long prod=skills[j+1]*skills[i-1];
        while(i<j){
            if((skills[j]+skills[i])==diff) prod+=skills[j]*skills[i];
            else return -1L;
            i++;
            j--;
        }
        return prod;
    }
}