import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {

            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                ans[idx++] = nums[deque.peekFirst()];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
