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
    ListNode newHead=null,newTail=null;
    public ListNode deleteDuplicates(ListNode head) {
        newHead=null;newTail=null;
        
        while(head!=null){
            if(head.next==null){
                addNode(head);
                head=head.next;
            }
            else if(head.next.val!=head.val){
                addNode(head);
                head=head.next;
            }
            else{
                int currval = head.val;
                while(head!=null&&head.val==currval){
                    head=head.next;
                }
            }
        }
        if(newTail!=null) newTail.next=null;
        return newHead;
    }
    
    public void addNode(ListNode node){
        if(newHead==null){
            newHead=node;
            newTail=node;
        }
        else{
            newTail.next=node;
            newTail=node;
        }
    }
}