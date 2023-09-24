package main; // Mendefinisikan paket (package) tempat class RestaurantMain berada

import restaurant.Restaurant; // Mengimpor class Restaurant dari paket restaurant
import restaurant.Pemesanan; // Mengimpor class Pemesanan dari paket restaurant
import java.util.logging.Level; // Mengimpor class Level dari paket java.util.logging
import java.util.logging.Logger; // Mengimpor class Logger dari paket java.util.logging

public class RestaurantMain { // Mendefinisikan class RestaurantMain
    public static void main(String[] args) { // Method utama (main)
        Logger logger = Logger.getLogger(Restaurant.class.getName()); // Membuat objek Logger

        Restaurant menu = new Restaurant(); // Membuat objek Restaurant

        // Menambahkan beberapa menu makanan ke dalam objek Restaurant
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 10);
        menu.tambahMenuMakanan("Molen", 1_000, 15);

        menu.tampilMenuMakanan(); // Menampilkan menu makanan yang tersedia

        // Pemesanan
        int pesananId = 3; // Contoh pesanan untuk id
        int jumlahPesanan = 5; // Jumlah pesanan yang diinginkan

        if (pesananId < Restaurant.getId()) { // Memeriksa apakah ID pesanan valid
            Pemesanan pesanan = new Pemesanan(pesananId, jumlahPesanan); // Membuat objek Pemesanan
            boolean berhasil = menu.pesanMakanan(pesanan); // Melakukan pemesanan

            if (berhasil) {
                logger.log(Level.INFO, "Pesanan berhasil! "); // Menampilkan pesan jika pemesanan berhasil
            }
        } else {
            logger.log(Level.INFO,"Menu tidak tersedia! Pesanan gagal."); // Menampilkan pesan jika pemesanan gagal
        }

        menu.tampilMenuMakanan(); // Menampilkan menu makanan setelah pesanan
    }
}
