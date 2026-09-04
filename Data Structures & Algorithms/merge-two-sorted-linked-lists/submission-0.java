/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode res = node;

        while(list1!=null &&list2!=null){
            if(list1.val<list2.val){
                ListNode temp = list1.next;
                node.next=list1;
                list1=temp;
                node=node.next;
            }
            else{
                ListNode temp = list2.next;
                node.next=list2;
                list2=temp;
                node=node.next;
            }
        }

        if(list1!=null){
            node.next=list1;
        }
        else{
            node.next=list2;
        }

        return res.next;

    }
}