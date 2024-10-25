class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> s=new ArrayList<>(Arrays.asList(folder));
        Collections.sort(s);
        for(int i=1;i<s.size();i++){
            System.out.println(s.get(i-1).length()+" "+s.get(i).length());
            if((s.get(i-1).length()<=s.get(i).length())){
                System.out.println(s.get(i).substring(0,s.get(i-1).length()));
            if((s.get(i-1).equals(s.get(i).substring(0,s.get(i-1).length())))){
                if(s.get(i).length()>s.get(i-1).length() &&s.get(i).charAt(s.get(i-1).length())!='/') continue;
                s.remove(i);
                i--;
            }
        }}
        return s;
    }
}