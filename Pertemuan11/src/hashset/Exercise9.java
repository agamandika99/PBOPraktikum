package hashset;
import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        // Membuat HashSet kosong
        HashSet<String> h_set = new HashSet<String>();

        // Menambahkan nilai ke dalam HashSet menggunakan metode add()
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        // Menampilkan HashSet awal
        System.out.println("Original Hash Set: " + h_set);

        // Membuat ArrayList dari elemen-elemen HashSet
        List<String> list = new ArrayList<String>(h_set);

        // Menampilkan elemen-elemen ArrayList
        System.out.println("ArrayList contains: " + list);
    }
}

