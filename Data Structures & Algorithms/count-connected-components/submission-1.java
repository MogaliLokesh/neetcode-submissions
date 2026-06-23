class Solution {
    public int countComponents(int n, int[][] edges) {
        // Set<Integer> visit = new HashSet<>();
        int[] visit = new int[n];
        int res=0;

        List<Integer>[] adj = new ArrayList[n];

        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge: edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        for(int i=0;i<n;i++){
            if(visit[i]==0){
                dfs(i, adj, visit);
                res++;
            }
        }

        return res;
    }

    void dfs(int node, List<Integer>[] adj, int[] visit){
        visit[node]=1;

        List<Integer> neighbors = adj[node];

        for(int i: neighbors){
            if(visit[i]==0) dfs(i, adj, visit);
        }
    }
}
