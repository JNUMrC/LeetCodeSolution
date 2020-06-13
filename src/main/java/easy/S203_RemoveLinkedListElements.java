package easy;

/**
 * 203. Remove Linked List Elements
 * Easy
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 * @author mrc
 * Date: 2020/4/20 0020
 * Time: 12:45
 */
public class S203_RemoveLinkedListElements
{
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode prev = head;
        prev = findNextNull(prev, val);
        if (prev == null) return null;
        head = prev;
        ListNode cur = prev.next;
        while (cur != null)
        {
            if (cur.val == val)
            {
                ListNode next = cur.next;
                next = findNextNull(next, val);
                prev.next = next;
                prev = next;
                cur = prev == null ? null : prev.next;
            }
            else
            {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    private ListNode findNextNull(ListNode node, int val)
    {
        while (node != null && node.val == val) node = node.next;
        return node;
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
