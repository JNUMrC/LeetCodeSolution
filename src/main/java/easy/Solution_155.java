package easy;

import java.util.ArrayList;

/**
 * 155. Min Stack
 * Easy
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 *
 * @author mrc
 * Date: 2020/4/3 0003
 * Time: 12:44
 */
public class Solution_155
{
    public static void main(String[] args)
    {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
    static class MinStack {

        ArrayList<Node> stack;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            Node node = new Node();
            node.val = x;
            node.min = stack.isEmpty() ? x : Math.min(x, stack.get(stack.size() - 1).min);
            stack.add(node);
        }

        public void pop() {
            if(!stack.isEmpty()) stack.remove(stack.size() - 1);
        }

        public int top() {
            return stack.isEmpty() ? 0 : stack.get(stack.size() - 1).val;
        }

        public int getMin() {
            return stack.isEmpty() ? 0 : stack.get(stack.size() - 1).min;
        }
        class Node
        {
            int  val;
            int min;
        }
    }



    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
