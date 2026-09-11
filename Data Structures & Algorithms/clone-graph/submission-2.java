/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()){
            Node cur = q.poll();
            Node copy;
            if(map.containsKey(cur)){
                copy = map.get(cur);
            }
            else{
                copy = new Node(cur.val);
                map.put(cur,copy);
            }

            for(Node nei : cur.neighbors){
                if(!map.containsKey(nei)){
                    map.put(nei, new Node(nei.val));
                    q.add(nei);
                }

                copy.neighbors.add(map.get(nei));
            }
        }

        return map.get(node);

        
    }
}