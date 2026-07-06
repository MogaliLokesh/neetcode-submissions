/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node node = head;
        Map<Node,Node> map = new HashMap<>();

        while(node!=null){
            Node temp = new Node(node.val);
            // temp.next = node.next;
            map.put(node,temp);
            node=node.next;
        }

        node=head;

        while(node!=null){
            Node temp = map.get(node);
            temp.next = map.get(node.next);
            temp.random = map.get(node.random);
            node=node.next;
        }

        return map.get(head);

    }
}
