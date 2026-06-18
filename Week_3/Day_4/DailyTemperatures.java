import java.util.*;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};

        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    temperatures[i] > temperatures[stack.peek()]) {

                int idx = stack.pop();
                ans[idx] = i - idx;
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}

