package treemap;
import java.util.*;
import java.util.Map.Entry;

public class Exercise11 {
    public static void main(String args[]) {
        // Membuat TreeMap tree_map1 dengan kunci Integer dan nilai String
        TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>();

        // Menambahkan elemen ke dalam peta
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");

        // Menampilkan konten TreeMap awal
        System.out.println("Original TreeMap content: " + tree_map1);

        // Mencetak pasangan kunci-nilai dengan kunci terbesar yang kurang dari atau sama dengan 10
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + tree_map1.floorEntry(10));

        // Mencetak pasangan kunci-nilai dengan kunci terbesar yang kurang dari atau sama dengan 30
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + tree_map1.floorEntry(30));

        // Mencetak pasangan kunci-nilai dengan kunci terbesar yang kurang dari atau sama dengan 70
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + tree_map1.floorEntry(70));
    }
}
