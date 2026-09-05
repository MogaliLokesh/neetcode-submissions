 class Node {
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int val){
        this.key=key;
        this.val=val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    HashMap<Integer,Node> set;
    int capacity;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.set = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next=this.right;
        this.right.prev=this.left;
    }
    public void removeNodeFromList(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        // left.next=left.next.next;
        // left.next.next.left=left;
    }

    public void addNodeToList(Node node){
        right.prev.next=node;
        node.prev=right.prev;
        right.prev=node;
        node.next=right;
    }

    public int get(int key) {
        if(set.containsKey(key)){
            //update the node in the linkedlist
            Node temp = set.get(key);
            removeNodeFromList(temp);
            addNodeToList(temp);
            return temp.val;
            // set.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(set.containsKey(key)){
            Node temp = set.get(key);
            removeNodeFromList(temp);
        }
        Node cur = new Node(key,value);
        addNodeToList(cur);
        set.put(key,cur);

        //check for length

        if(set.size()>capacity){
            //remove last element from set and list..
            Node last = left.next;
            removeNodeFromList(last);
            set.remove(last.key);
        }
    }
}
