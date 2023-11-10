package priorityqueue;
import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        // Membuat PriorityQueue pq1
        PriorityQueue<String> pq1 = new PriorityQueue<String>();

        // Menambahkan nilai ke dalam PriorityQueue menggunakan metode add()
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");

        // Menampilkan PriorityQueue pq1
        System.out.println("Original Priority Queue: " + pq1);

        // Mengonversi PriorityQueue menjadi representasi string menggunakan toString()
        String str1;
        str1 = pq1.toString();
        System.out.println("String representation of the Priority Queue: " + str1);
    }
}
