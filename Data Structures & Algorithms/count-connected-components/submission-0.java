class Solution {
    public int countComponents(int n, int[][] edges) {
        Set<Integer> visit = new HashSet<>();
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
            if(!visit.contains(i)){
                dfs(i, adj, visit);
                res++;
            }
        }

        return res;
    }

    void dfs(int node, List<Integer>[] adj, Set<Integer> visit){
        visit.add(node);

        List<Integer> neighbors = adj[node];

        for(int i: neighbors){
            if(!visit.contains(i)) dfs(i, adj, visit);
        }
    }
}
