class Solution {
    public String answerString(String word, int numFriends) {
        int j=0;
        if(numFriends==1){
            return word;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>word.charAt(j)){
                j=i;
            }
        }
        ArrayList<Integer> ar=new ArrayList<>();
        char c=word.charAt(j);
        for(int i=0;i<word.length();i++){
            if(c==word.charAt(i)){
                ar.add(i);
            }
        }
        int maxLength=word.length()-numFriends+1;
        String res="",r="";
        for( int jj:ar){
            j=jj;
            if(j+maxLength<word.length()){
                r= word.substring(j,j+maxLength);
            }
            else{
                r= word.substring(j);
            }
            res=res.compareTo(r)>0?res:r;
        }
        return res;
       
    }
}