package kasusketiga;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah bilangan bulat yang akan diurutkan.
        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];  // Inisialisasi array untuk menyimpan bilangan bulat.

        // Meminta pengguna untuk memasukkan bilangan-bilangan bulat.
        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();  // Mengisi array dengan bilangan-bilangan yang dimasukkan.
        }

        Sorting.insertionSort(intList);  // Menggunakan insertion sort untuk mengurutkan bilangan-bilangan.

        // Menampilkan bilangan-bilangan yang telah diurutkan.
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + "  ");
        }
        System.out.println();
    }
}
