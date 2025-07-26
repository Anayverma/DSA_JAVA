class Solution {
    public int firstUniqChar(String s) {
        int ch[]=new int[26];
        for(char c:s.toCharArray()) ch[c-'a']++;
        for(char c:s.toCharArray()){
            if(ch[c-'a']==1) return s.indexOf(c);
        }
        return -1;
    }
}