package treemap;
import java.util.*;
import java.util.Map.Entry;

public class Exercise26 {
    public static void main(String args[]) {
        // Mendeklarasikan TreeMap tree_map dengan kunci Integer dan nilai String
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        // Menambahkan elemen ke dalam peta
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        // Menampilkan konten TreeMap awal
        System.out.println("Original TreeMap content: " + tree_map);

        // Mendapatkan kunci terkecil yang lebih besar dari atau sama dengan 20
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));

        // Mendapatkan kunci terkecil yang lebih besar dari atau sama dengan 30
        System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));

        // Mendapatkan kunci terkecil yang lebih besar dari atau sama dengan 50
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
    }
}

