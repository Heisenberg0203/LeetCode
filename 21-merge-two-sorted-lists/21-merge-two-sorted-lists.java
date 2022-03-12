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
    ListNode head = null,tail=null;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        head=null;tail=null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                addNode(list1);
                list1=list1.next;
            }     
            else{
                addNode(list2);
                list2=list2.next;
            }
        }
        
        if(list1!=null) tail.next=list1;
        if(list2!=null) tail.next=list2;
        return head;
    }
    
    public void addNode(ListNode listNode){
        if(head==null){
            head=listNode;
            tail=listNode;
        }
        else{
            tail.next=listNode;
            tail=tail.next;
        }
    }
}