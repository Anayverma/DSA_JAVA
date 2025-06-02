class Solution {
    public int candy(int[] ratings) {
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        int []res=new int[ratings.length];
        for(int i=0;i<20002;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<ratings.length;i++){
            ar.get(ratings[i]).add(i);
        }
        int result=0;
        for(int i=0;i<20002;i++){
            if(ar.get(i).size()==0){
                continue;
            }
            for(int jk=0;jk<ar.get(i).size();jk++){
                int left=0,right=0;
                int j=ar.get(i).get(jk);
                // System.out.println(j);
                if(j-1>=0 && ratings[j]>ratings[j-1]){
                    left=res[j-1];
                }
                if(j+1<ratings.length && ratings[j]>ratings[j+1]){
                    right=res[j+1];
                }
                res[j]=Math.max(left,right)+1;
                result+=res[j];
                // System.out.println( left +" "+right+" "+res[j]+" "+i);
            }
        }
        return result;
    }
}