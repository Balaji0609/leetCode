package leetCode;

public class Remove_Linked_List_Elements_203 
{
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
    public ListNode removeElements(ListNode head, int val) 
    {
        while((head != null) && (head.val == val))
            head = head.next;
        ListNode tmp = head;
        while(tmp != null && tmp.next != null)
        {
            if(tmp.next.val == val)
            {
                tmp.next = tmp.next.next;
            }
            else
            {
                tmp = tmp.next;
            }
        }
        return head;
    }
}
