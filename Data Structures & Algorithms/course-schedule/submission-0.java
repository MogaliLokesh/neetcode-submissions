class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // int [][]
        // int [][] adj = new int[numCourses][];
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }


        for(int i=0;i<numCourses;i++){
            if(!dfs(i,adj,visited)) return false;
        }

        return true;
    }

    private boolean dfs(int i, List<List<Integer>> adj, boolean[] visited){
        if(visited[i]==true) return false;
        if(adj.get(i).size()==0) return true;


        visited[i]=true;
        for(int dep : adj.get(i)){
            if(!dfs(dep,adj,visited)) return false;
        }

        visited[i]=false;
        adj.set(i,new ArrayList<>());
        return true;
    }
}
