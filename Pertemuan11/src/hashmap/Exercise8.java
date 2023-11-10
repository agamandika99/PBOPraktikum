package hashmap;
import java.util.*;

public class Exercise8 {
    public static void main(String args[]) {
        // Membuat HashMap hash_map dengan kunci Integer dan nilai String
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // Menampilkan peta awal
        System.out.println("The Original map: " + hash_map);

        // Pengecekan apakah nilai 'Green' ada dalam peta
        System.out.println("1. Is value 'Green' exists?");
        if (hash_map.containsValue("Green")) {
            // Nilai ada dalam peta
            System.out.println("Yes!");
        } else {
            // Nilai tidak ada dalam peta
            System.out.println("No!");
        }

        // Pengecekan apakah nilai 'orange' ada dalam peta
        System.out.println("\n2. Is value 'orange' exists?");
        if (hash_map.containsValue("orange")) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}

