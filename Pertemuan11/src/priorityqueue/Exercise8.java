package priorityqueue;
import java.util.PriorityQueue;

public class Exercise8 {
    public static void main(String[] args) {
        // Membuat PriorityQueue pq1 dan pq2
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

        // Menambahkan angka-angka ke dalam PriorityQueue pq1
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);

        // Menampilkan PriorityQueue pq1
        System.out.println("Original Priority Queue: " + pq1);

        // Mendapatkan dan menampilkan elemen pertama dari PriorityQueue pq1 menggunakan peek()
        System.out.println("The first element of the Queue: " + pq1.peek());
    }
}

