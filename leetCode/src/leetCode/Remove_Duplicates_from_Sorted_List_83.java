package leetCode;

public class Remove_Duplicates_from_Sorted_List_83 
{
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode pt =  head;
        
        int val = head.val;
        ListNode prev = head;
        head = head.next;
        
        while(head != null)
        {
            if(head.val == val)
            {
                prev.next = head.next;
                head.next = null;
                head = prev.next; 	
            }
            else
            {
                val = head.val;
                prev = head;
                head = head.next;
            }
        }
        return pt;
    }
}
