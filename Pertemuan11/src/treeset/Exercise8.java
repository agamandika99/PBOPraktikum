package treeset;
import java.util.TreeSet;
import java.util.Iterator;

public class Exercise8 {
    public static void main(String[] args) {
        // Membuat TreeSet pertama
        TreeSet<String> t_set1 = new TreeSet<String>();

        // Menambahkan nilai ke dalam TreeSet pertama menggunakan metode add()
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("First Tree set: " + t_set1);

        // Membuat TreeSet kedua
        TreeSet<String> t_set2 = new TreeSet<String>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: " + t_set2);

        // Membuat TreeSet untuk menyimpan hasil perbandingan
        TreeSet<String> result_set = new TreeSet<String>();

        // Membandingkan elemen-elemen dalam TreeSet pertama dengan elemen-elemen dalam TreeSet kedua
        for (String element : t_set1) {
            System.out.println(t_set2.contains(element) ? "Yes" : "No");
        }
    }
}

