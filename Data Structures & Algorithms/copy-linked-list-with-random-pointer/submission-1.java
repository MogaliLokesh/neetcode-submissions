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
        HashMap<Node,Node>map = new HashMap<>();
        Node pointer = head;

        while(pointer!=null){
            map.put(pointer,new Node(pointer.val));
            pointer=pointer.next;
        }

        pointer=head;

        while(pointer!=null){
            // int val=pointer
            Node temp=map.get(pointer);

            Node next=null;
            if(pointer.next!=null){
                next=map.get(pointer.next);
            }
            Node random=null;
            if(pointer.random!=null){
             random=map.get(pointer.random);
            }
            temp.next=next;
            temp.random=random;
            pointer=pointer.next;
        }

        return map.get(head);

    }
}
