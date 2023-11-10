package hashset;
import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        // Membuat HashSet pertama
        HashSet<String> h_set1 = new HashSet<String>();

        // Menambahkan nilai ke dalam HashSet pertama menggunakan metode add()
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");

        // Menampilkan konten HashSet pertama
        System.out.println("First HashSet content: " + h_set1);

        // Membuat HashSet kedua
        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");

        // Menampilkan konten HashSet kedua
        System.out.println("Second HashSet content: " + h_set2);

        // Menyimpan elemen-elemen yang terdapat di kedua HashSet menggunakan retainAll()
        h_set1.retainAll(h_set2);

        // Menampilkan konten HashSet setelah operasi retainAll()
        System.out.println("HashSet content after retainAll():");
        System.out.println(h_set1);
    }
}

