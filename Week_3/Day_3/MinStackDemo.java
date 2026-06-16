import java.util.*;
public class MinStackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        int[] nums = {5, 2, 8, 1};

        for (int num : nums) {
            stack.push(num);
            if (minStack.isEmpty() || num <= minStack.peek()) {
                minStack.push(num);
            }
        }
        System.out.println("Minimum: " + minStack.peek());
    }
}
