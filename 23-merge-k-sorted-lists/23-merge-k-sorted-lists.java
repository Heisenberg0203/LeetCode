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
  
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((i1,i2)->i1.val-i2.val);
        
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null) pq.add(lists[i]);
        }
        
        ListNode head=null;
        ListNode tail=null;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            if(head==null){
                head=curr;
                tail=curr;
            }
            else{
                tail.next=curr;
                tail=curr;
            }
            
            if(curr.next!=null) pq.add(curr.next);
        }
        
        
        return head;
    }
}