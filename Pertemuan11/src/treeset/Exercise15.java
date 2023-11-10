package treeset;
import java.util.TreeSet;
import java.util.Iterator;

public class Exercise15 {
    public static void main(String[] args) {
        // Membuat TreeSet tree_num
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> tree_headset = new TreeSet<Integer>();

        // Menambahkan angka-angka ke dalam tree_num
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        // Menampilkan tree_num sebelum penghapusan
        System.out.println("Original tree set: " + tree_num);

        // Menghapus dan menampilkan elemen terakhir dari tree_num menggunakan pollLast()
        System.out.println("Removes the last element: " + tree_num.pollLast());

        // Menampilkan tree_num setelah penghapusan
        System.out.println("Tree set after removing last element: " + tree_num);
    }
}

