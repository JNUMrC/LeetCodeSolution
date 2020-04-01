package easy;

/**
 * 83. Remove Duplicates from Sorted List
 * Easy
 *
 * 1033
 *
 * 89
 *
 * Add to List
 *
 * Share
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 *
 * @author mrc
 * Date: 2019/11/8 0008
 * Time: 10:28
 */
public class Solution_83
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
            return null;

        ListNode cur = head;
        ListNode next = cur.next;
        int prev = cur.val;
        while (next != null)
        {
            if (next.val == prev)
            {
                cur.next = next.next;
            }
            else
            {
                cur = next;
                prev = cur.val;
            }
            next = cur.next;
        }
        return head;
    }

    public class ListNode
    {
        int      val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
}
