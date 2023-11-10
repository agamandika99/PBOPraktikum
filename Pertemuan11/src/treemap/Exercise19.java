package treemap;
import java.util.*;
import java.util.Map.Entry;

public class Exercise19 {
    public static void main(String args[]) {
        // Membuat TreeMap tree_map dengan kunci Integer dan nilai String
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        // Menambahkan elemen ke dalam peta
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        // Menampilkan nilai sebelum operasi poll
        System.out.println("Value before poll: " + tree_map);

        // Menghapus dan mengembalikan pasangan kunci-nilai dengan kunci terkecil
        System.out.println("Value returned: " + tree_map.pollFirstEntry());

        // Menampilkan nilai setelah operasi poll
        System.out.println("Value after poll: " + tree_map);
    }
}

