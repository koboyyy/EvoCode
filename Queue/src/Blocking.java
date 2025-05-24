import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blocking {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);

        bq.put("A");
        bq.put("B");

        System.out.println(bq.take());

    }
}
