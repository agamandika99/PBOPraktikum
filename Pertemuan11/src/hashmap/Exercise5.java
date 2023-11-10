package hashmap;
import java.util.*;

public class Exercise5 {
    public static void main(String args[]) {
        // Membuat HashMap hash_map dengan kunci Integer dan nilai String
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // Memeriksa apakah peta kosong
        boolean result = hash_map.isEmpty();

        // Menampilkan hasil pemeriksaan
        System.out.println("Is hash map empty: " + result);

        // Menghapus semua elemen dari peta
        hash_map.clear();

        // Kembali memeriksa apakah peta kosong setelah dihapus
        result = hash_map.isEmpty();

        // Menampilkan hasil pemeriksaan setelah penghapusan
        System.out.println("Is hash map empty: " + result);
    }
}

