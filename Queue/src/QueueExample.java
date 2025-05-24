import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();

        // Enqueue
        antrian.offer("Andi");
        antrian.offer("Budi");
        antrian.offer("Citra");

        System.out.println("Isi antrian: " + antrian);

        // Peek (lihat paling depan)
        System.out.println("Yang pertama: " + antrian.peek());

        // Dequeue (hapus dari depan)
        antrian.poll();
        System.out.println("Setelah satu keluar: " + antrian);

        // Ukuran dan cek kosong
        System.out.println("Jumalh antrian: " + antrian.size());
        System.out.println("Apakah kosong? " + antrian.isEmpty());
    }
}
