package leetCode;

public class Merge_Two_Sorted_Lists_21 
{
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        while(l1 != null || l2 != null)
        {
            if(l1 == null)
            {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
            else if(l2 == null)
            {
               temp.next = new ListNode(l1.val);
               temp = temp.next;
               l1 = l1.next;                
            }
            else if(l1.val <= l2.val)
            {
               temp.next = new ListNode(l1.val);
               temp = temp.next;
               l1 = l1.next;
            }
            else
            {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
