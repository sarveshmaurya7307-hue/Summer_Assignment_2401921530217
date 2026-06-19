import java.util.*;

public class RecentCounterDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        int[] pings = {1, 100, 3001, 3002};

        for (int t : pings) {

            queue.offer(t);

            while (queue.peek() < t - 3000) {
                queue.poll();
            }

            System.out.println(queue.size());
        }
    }
}
