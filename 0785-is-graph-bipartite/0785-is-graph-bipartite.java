class Solution {
    public boolean isBipartite(int[][] graph) {
        ArrayList<Integer> path= new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int visited[]=new int[graph.length];
        path.add(0);
        dfs(graph,path,res,visited,0,-1);
        for(int i=1;i<graph.length;i++)
        {
            if(visited[i]==0)
            {path.clear();
        path.add(i);
        dfs(graph,path,res,visited,i,-1);}
        }
        // System.out.println("jj"+res.size());
        return !(res.size()>=1);
    }
    public void dfs(int[][] graph,ArrayList<Integer> path ,ArrayList<Integer> res, int[] visited,int cur,int parent){
        // System.out.println("----------");
        // System.out.println("c"+cur);
                
        visited[cur]=1;
        for(int i=0;i<graph[cur].length;i++){
            if(visited[graph[cur][i]]==0){
                // System.out.println(graph[cur][i]);
                path.add(graph[cur][i]);
                // System.out.println("path->"+path);
                dfs(graph,path, res, visited, graph[cur][i],cur);
                path.remove(path.indexOf(graph[cur][i]));
            }
            else {
                if(path.contains(graph[cur][i]) && (graph[cur][i]!=parent )) {
                    // System.out.println("p"+graph[cur][i]);
                    if((path.size()-path.indexOf(graph[cur][i]))%2!=0)
                    res.add(1);
                    return;
                }
            }
        }
    }
}
