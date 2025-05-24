import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.offerFirst("Depan");
        dq.offerLast("Belakang");

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

    }
}
