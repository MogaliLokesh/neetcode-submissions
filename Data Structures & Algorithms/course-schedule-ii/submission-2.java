class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] preq: prerequisites){
            adj.get(preq[0]).add(preq[1]);
        }

                System.out.println(res);

        for(int i=0;i<numCourses;i++){
            if(adj.get(i).size()==0) res.add(i);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i,adj,visited,res)) return new int[]{};
        }


        System.out.println(res);
        return res.stream().mapToInt(i -> i).toArray();    
        }


    private boolean dfs(int i, List<List<Integer>> adj,boolean[] visited, List<Integer> res){
        if(visited[i]==true) return false;

        if(adj.get(i).size()==0){
            // we need to check if already exists before adding
            //  res.add(i);
            return true;
        }

        visited[i]=true;
        for(int nei: adj.get(i)){
            if(!dfs(nei,adj,visited,res)) return false;
        }

        adj.set(i, new ArrayList<>());
        visited[i]=false;
        res.add(i);
        return true;
    }
}
