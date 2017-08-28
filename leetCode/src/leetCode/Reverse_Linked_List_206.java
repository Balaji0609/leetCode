package leetCode;

public class Reverse_Linked_List_206 
{
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode ptr = head.next;
            head.next = prev;
            prev = head;
            head = ptr;
        }
        return head;        
    }
}
