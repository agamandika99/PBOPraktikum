package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class Exercise10 {
    public static void main(String[] args) {
        // Membuat linked list kosong
        LinkedList<String> l_list = new LinkedList<String>();

        // Menambahkan nilai ke dalam linked list menggunakan metode add()
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // Menampilkan daftar awal
        System.out.println("Original linked list: " + l_list);

        // Mencari elemen pertama dalam daftar
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: " + first_element);

        // Mencari elemen terakhir dalam daftar
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: " + last_element);
    }
}

