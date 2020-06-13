package easy;

/**
 * 21. Merge Two Sorted Lists
 * Easy
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * @author mrc
 * Date: 2019/11/7 0007
 * Time: 14:21
 */
public class S21_MergerTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode r;
        if (l1.val > l2.val)
        {
            r = l2;
            l2 = l2.next;
        }
        else
        {
            r = l1;
            l1 = l1.next;
        }
        ListNode t = r;
        while (l1 != null && l2 != null)
        {
            if (l1.val > l2.val)
            {
                t.next = l2;
                t = l2;
                l2 = l2.next;
            }
            else
            {
                t.next = l1;
                t = l1;
                l1 = l1.next;
            }
        }

        while (l2 != null)
        {
            t.next = l2;
            t = l2;
            l2 = l2.next;
        }

        while (l1 != null)
        {
            t.next = l1;
            t = l1;
            l1 = l1.next;
        }
        return r;
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
