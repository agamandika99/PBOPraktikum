package arraylist;
import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        // Membuat sebuah ArrayList dan menambahkan beberapa warna ke dalamnya
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        // Menampilkan ArrayList sebelum pembalikan
        System.out.println("List before reversing :\n" + list_Strings);

        // Membalik urutan elemen dalam ArrayList menggunakan Collections.reverse
        Collections.reverse(list_Strings);

        // Menampilkan ArrayList setelah pembalikan
        System.out.println("List after reversing :\n" + list_Strings);
    }
}
