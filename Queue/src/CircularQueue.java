public class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    // Constructor
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue penuh (Overflow)!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue operation
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue kosong (Underflow)!");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        System.out.println("Dequeued: " + value);
        return value;
    }

    // Display the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue kosong!");
            return;
        }

        System.out.print("Isi Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Main method (testing)
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5); // Ukuran queue 5

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);  // Seharusnya penuh di sini
        cq.enqueue(60);  // Akan gagal

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.enqueue(60);  // Memanfaatkan ruang kosong (circular)
        cq.enqueue(70);

        cq.display();    // Lihat hasil akhir
    }
}
