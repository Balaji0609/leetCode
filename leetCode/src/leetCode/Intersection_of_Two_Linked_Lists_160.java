package leetCode;

public class Intersection_of_Two_Linked_Lists_160 
{
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
		 val = x;
		 next = null;
		}
	 }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode headAT = headA;
        ListNode headBT = headB;
        int lenA = 0;
        int lenB = 0;
        while(headAT != null)
        {
            headAT = headAT.next;
            lenA++;
        }
        while(headBT != null)
        {
            headBT = headBT.next;
            lenB++;
        }
        
        
        while(lenA>lenB)
        {
            headA = headA.next;
            lenA--;
        }
        while(lenA<lenB)
        {
            headB = headB.next;
            lenB--;
        }
        
        while(headA != null && headB != null)
        {
            if(headA == headB)
            {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
