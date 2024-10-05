class Solution {
    public String reverseWords(String s) {
       String res="",w="";
       s=s.trim();
       s=" "+s;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' ')    w=s.charAt(i)+w;
        else {
            if(w.length()!=0)   res+=w+" ";
            w="";
        }
       } 
       return res.trim();
    }
}