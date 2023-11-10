package hashset;
import java.util.*;
import java.util.Iterator;

public class Exercise2 {
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

        // Mendapatkan Iterator untuk HashSet
        Iterator<String> p = h_set.iterator();

        // Mengiterasi dan mencetak elemen-elemen HashSet
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}

