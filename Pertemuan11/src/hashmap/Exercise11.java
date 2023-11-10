package hashmap;
import java.util.*;

public class Exercise11 {
    public static void main(String args[]) {
        // Membuat HashMap hash_map dengan kunci Integer dan nilai String
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // Mendapatkan kumpulan kunci dari peta menggunakan keySet()
        Set keyset = hash_map.keySet();

        // Menampilkan nilai-nilai kunci
        System.out.println("Key set values are: " + keyset);
    }
}

