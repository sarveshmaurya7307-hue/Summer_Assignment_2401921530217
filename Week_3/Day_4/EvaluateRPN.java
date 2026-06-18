import java.util.*;

public class EvaluateRPN {

    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {

            switch (token) {

                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        System.out.println(stack.pop());
    }
}
