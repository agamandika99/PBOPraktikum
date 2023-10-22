package kasusketiga;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah string yang akan diurutkan.
        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];  // Inisialisasi array untuk menyimpan string.

        // Meminta pengguna untuk memasukkan string.
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();  // Mengisi array dengan string yang dimasukkan.
        }

        Sorting.insertionSort(stringList);  // Menggunakan insertion sort untuk mengurutkan string.

        // Menampilkan string yang telah diurutkan.
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i] + "  ");
        }
        System.out.println();
    }
}
