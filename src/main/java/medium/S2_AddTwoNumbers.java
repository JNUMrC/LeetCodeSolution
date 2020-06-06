package medium;

/**
 * 2. Add Two Numbers
 * Medium
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @author mrc
 * Date: 2020/6/5 0005
 * Time: 11:40
 */
public class S2_AddTwoNumbers
{
    public static void main(String[] args)
    {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int n = 0;
        ListNode head = null;
        ListNode cur = null;
        while (l1 != null && l2 != null)
        {
            int sum = l1.val + l2.val + n;
            l1 = l1.next;
            l2 = l2.next;
            ListNode node = new ListNode(sum % 10);
            n = sum / 10;
            if(cur == null)
                head = node;
            else
                cur.next = node;
            cur = node;
        }
        while (l1 != null)
        {
            int sum = l1.val + n;
            l1 = l1.next;
            ListNode node = new ListNode(sum % 10);
            n = sum / 10;
            if(cur == null)
                head = node;
            else
                cur.next = node;
            cur = node;
        }
        while (l2 != null)
        {
            int sum = l2.val + n;
            l2 = l2.next;
            ListNode node = new ListNode(sum % 10);
            n = sum / 10;
            if(cur == null)
                head = node;
            else
                cur.next = node;
            cur = node;
        }
        if(n > 0)
        {
            cur.next = new ListNode(n);
        }
        return head;
    }

    public class ListNode
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
