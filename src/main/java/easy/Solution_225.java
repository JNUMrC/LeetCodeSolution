package easy;

/**
 * 225. Implement Stack using Queues
 * Easy
 * Implement the following operations of a stack using queues.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Example:
 * <p>
 * MyStack stack = new MyStack();
 * <p>
 * stack.push(1);
 * stack.push(2);
 * stack.top();   // returns 2
 * stack.pop();   // returns 2
 * stack.empty(); // returns false
 * Notes:
 * <p>
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 *
 * @author mrc
 * Date: 2020/5/18 0018
 * Time: 12:29
 */
public class Solution_225
{
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    class MyStack
    {

        private MyQueue queue = null;

        /** Initialize your data structure here. */
        public MyStack()
        {
            queue = new MyQueue();
        }

        /** Push element x onto stack. */
        public void push(int x)
        {
            queue.push(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop()
        {
            return queue.pop();
        }

        /** Get the top element. */
        public int top()
        {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty()
        {
            return queue.size() <= 0;
        }
    }

    class MyQueue
    {
        private MyNode top = null;
        private int size = 0;

        public void push(int x)
        {
            MyNode node = new MyNode(x);
            node.setNext(top);
            top = node;
            size++;
        }

        public int pop()
        {
            int value = top.getValue();
            top = top.getNext();
            size--;
            return value;
        }

        public int peek()
        {
            return top.getValue();
        }

        public int size()
        {
            return size;
        }
    }

    class MyNode
    {
        private int    value;
        private MyNode next;

        public void setValue(int value)
        {
            this.value = value;
        }

        public void setNext(MyNode next)
        {
            this.next = next;
        }

        public int getValue()
        {
            return value;
        }

        public MyNode getNext()
        {
            return next;
        }

        public MyNode(int value)
        {
            this.value = value;
        }
    }

}
