package priorityqueue;
import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        // Membuat PriorityQueue pq1 dengan urutan prioritas terbalik
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());

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
        System.out.println("\nOriginal Priority Queue: " + pq1);

        // Mengeluarkan dan mencetak elemen-elemen secara terurut dari PriorityQueue
        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while ((val = pq1.poll()) != null) {
            System.out.print(val + "  ");
        }
        System.out.print("\n");
    }
}

