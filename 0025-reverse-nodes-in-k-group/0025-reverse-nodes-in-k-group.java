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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)   return head;
        ListNode left = head;
        ListNode prevLeft = null;
        ListNode leftHead = null;
        int size = k;

        while(true)
        {
            ListNode right = left;

            for(int i=0; i<size-1; i++)
            {
                if(right == null)   break;
                right = right.next;
            }


            if(right != null)
            {
                ListNode next = right.next;

                reverse(left, size);
                
                if(prevLeft != null)
                    prevLeft.next = right;
                prevLeft = left;
                if(leftHead == null)
                    leftHead = right;

                left = next;
            }
            else
            {
               if(prevLeft != null)
                prevLeft.next = left;

                if(leftHead == null)
                    leftHead = left;
                break;
            }


        }
        return leftHead;
    }

    void reverse(ListNode left, int size)
    {
        ListNode prev = null;
        while(size-- > 0)
        {
            ListNode next = left.next;
            left.next = prev;
            prev = left;
            left = next;
        }
        return;
    }
}