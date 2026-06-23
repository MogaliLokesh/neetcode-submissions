class Solution {
    public boolean validTree(int n, int[][] edges) {

        if(edges.length != n-1) return false;

        List<Integer>[] adjList = new ArrayList[n];

        for(int i=0;i<n;i++){
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            // adjList[edge[0]].addifExists(edge[1]);
            // adjList[edge[1]].addifExists(edge[0]);
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        Set<Integer> visit = new HashSet<>();

        boolean res = dfs(0, adjList, visit);

        if(visit.size() == n) return res;
        else return false;

    }

    boolean dfs(int node, List<Integer>[] adjList, Set<Integer> visit){
        if(visit.contains(node)) return false;

        List<Integer> adj = adjList[node];

        visit.add(node);

        for(int i: adj){
            
            if(!visit.contains(i) & !dfs(i, adjList, visit)) return false;
        }

        return true;
    }
}
