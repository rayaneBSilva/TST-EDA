import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(pop(index));

    }

    public static int pop(int index) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int topo = stack.size() - 1;
        int value = 0;

        while (topo > index) {
            queue.add(stack.pop());
            topo--;
        }

        if (topo == index) {
            value = stack.peek();
            stack.pop();
        }

        while (!queue.isEmpty()) {
            aux.push(queue.remove());
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
       return value;

    }

}