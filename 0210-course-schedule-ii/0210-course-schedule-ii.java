class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inorder=new int [numCourses];
        ArrayList<ArrayList<Integer>> test=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            test.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            inorder[prerequisites[i][0]]+=1;
            test.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int res[]=new int[numCourses];
        int a=0;
        Queue<Integer> lev=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inorder[i]==0) lev.add(i);
        }
        while(!lev.isEmpty()){
            int ele=lev.poll();
            res[a++]=ele;
            int l=test.get(ele).size();
            for(int i=0;i<l;i++){
                int n=test.get(ele).get(i);
                inorder[n]-=1;
                if(inorder[n]==0) lev.add(n);
            }
        }
        for(int i=0;i<numCourses;i++){
            if(inorder[i]!=0) return new int[]{};
        }
        if(prerequisites.length==0){
            for(int i=0;i<numCourses;i++){
                res[i]=numCourses-i-1;
            }
        }

        return res;
    }
}