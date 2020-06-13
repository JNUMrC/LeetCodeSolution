package easy;

/**
 * 234. Palindrome Linked List
 * Easy
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * @author mrc
 * Date: 2020/6/7 0007
 * Time: 15:38
 */
public class S234_PalindromeLinkedList
{
    public boolean isPalindrome(ListNode head)
    {
        ListNode slow = head, fast = head ;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null)
        {
            if(fast.val != slow.val)
            {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode slow)
    {
        ListNode head = slow;
        while (slow != null && slow.next != null)
        {
            head = slow.next;
            head.next = slow;
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
