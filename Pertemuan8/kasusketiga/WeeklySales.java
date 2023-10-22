package kasusketiga;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        // Meminta pengguna untuk memasukkan detail salesperson
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter salesperson " + (i + 1) + " details:");
            System.out.print("First Name: ");
            String firstName = scan.next();
            System.out.print("Last Name: ");
            String lastName = scan.next();
            System.out.print("Total Sales: ");
            int totalSales = scan.nextInt();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        // Menggunakan algoritma insertion sort untuk mengurutkan salesperson berdasarkan total penjualan
        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        // Menampilkan daftar salesperson yang sudah diurutkan
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
