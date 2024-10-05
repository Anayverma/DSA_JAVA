class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<goal.length();i++) if(s.charAt(0)==goal.charAt(i)) a.add(i);
        for(int i=0;i<a.size();i++){
            int j=0;
            for(j=0;j<s.length();j++){
                if(s.charAt(j)!=goal.charAt((j+a.get(i))%s.length()))
                break;
            }
            if(j==s.length()) return true;
        }
        return false;
    }
}