class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inorder = new int[graph.length];  // In-degree array

        // Build reverse graph and calculate in-degrees
        for (int i = 0; i < graph.length; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(graph[i][j]).add(i);  // Reverse edge
                inorder[i]++;  // Count in-degrees for original graph
            }
        }

        Queue<Integer> lev = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        // Find all terminal nodes (with no outgoing edges)
        for (int i = 0; i < graph.length; i++) {
            if (inorder[i] == 0) {
                lev.add(i);  // Add terminal nodes to the queue
                vis[i] = true;
            }
        }

        // Process the nodes with zero in-degree in reverse graph
        while (!lev.isEmpty()) {
            int n = lev.poll();
            for (int i = 0; i < adj.get(n).size(); i++) {
                int neighbor = adj.get(n).get(i);
                inorder[neighbor]--;  // Decrease in-degree
                if (inorder[neighbor] == 0 && !vis[neighbor]) {
                    lev.add(neighbor);  // Add node to the queue if it becomes safe
                    vis[neighbor] = true;
                }
            }
        }

        // Collect all safe nodes (where vis[i] is true)
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (vis[i]) {
                safeNodes.add(i);
            }
        }

        Collections.sort(safeNodes);  // Sort the result
        return safeNodes;
    }
}
