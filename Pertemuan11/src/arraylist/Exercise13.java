package arraylist;

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        // Membuat ArrayList c1 dan menambahkan beberapa elemen
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Membuat ArrayList c2 dan menambahkan beberapa elemen
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Membuat ArrayList c3 untuk menyimpan hasil perbandingan
        ArrayList<String> c3 = new ArrayList<String>();

        // Membandingkan elemen-elemen dalam c1 dengan elemen-elemen dalam c2
        // dan menyimpan "Yes" jika ada, atau "No" jika tidak ada dalam c3
        for (String e : c1) {
            c3.add(c2.contains(e) ? "Yes" : "No");
        }

        // Menampilkan hasil perbandingan
        System.out.println(c3);
    }
}

