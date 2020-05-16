package easy;

/**
 * 206. Reverse Linked List
 * Easy
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * @author mrc
 * Date: 2020/5/15 0015
 * Time: 12:47
 */
public class Solution_206
{
    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        new Solution_206().reverseList(node1);
    }

    public ListNode reverseList(ListNode head)
    {
        ListNode t = null;
        while (head != null)
        {
            ListNode next = head.next;
            head.next = t;
            if (next == null)
                break;
            t = head;
            head = next;

        }
        return head;
    }

    public static class ListNode
    {
        int      val;
        ListNode next;

        ListNode()
        {
        }

        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }
}
