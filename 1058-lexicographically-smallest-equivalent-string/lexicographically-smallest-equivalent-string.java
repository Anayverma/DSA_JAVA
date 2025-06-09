class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int dict[]=new int[26];
        for(int i=0;i<26;i++){
            dict[i]=i;
        }
        for(int ii=0;ii<s1.length();ii++){
            int ch1=dict[s1.charAt(ii)-'a'], ch2=dict[s2.charAt(ii)-'a'];
            int min=Math.min(ch1,ch2);
            for(int i=0;i<26;i++){
                if(dict[i]==ch1 || dict[i]==ch2){
                    dict[i]=min;
                }
            }
        }
        String res="";
        for(char ch:baseStr.toCharArray()){
            res=res+((char)('a'+dict[ch-'a']));
        }
        return res;
    }
}