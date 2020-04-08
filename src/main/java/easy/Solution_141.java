package easy;

/**
 * 141. Linked List Cycle
 * Easy
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 * <p>
 * <p>
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Can you solve it using O(1) (i.e. constant) memory?
 *
 * @author mrc
 * Date: 2020/4/3 0003
 * Time: 12:24
 */
public class Solution_141
{
    public boolean hasCycle(ListNode head)
    {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null)
        {
            slow = slow.next;
            if(fast.next == null) return false;
            else fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    class ListNode
    {
        int      val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
            next = null;
        }
    }
}
