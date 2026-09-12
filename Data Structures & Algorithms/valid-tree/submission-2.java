class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        boolean[] curVisited = new boolean[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        if(!dfs(0, -1, adj, visited)) return false;

        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }

        return true;
    }

    private boolean dfs(int i, int parent, List<List<Integer>> adj, boolean[] visited){
        if(visited[i]==true) return false;

        // curVisited[i]=true;
        visited[i]=true;
        for(int nei: adj.get(i)){
            if(nei==parent) continue;
            if(!dfs(nei, i, adj,visited)) return false;
        }

        return true;

    }
}
