package main;

import restaurant.Restaurant;
import restaurant.Produk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant(); // Membuat objek Restaurant

        // Menambahkan menu makanan awal
        menu.tambahMenuAwal();

        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        boolean pesanLagi = true; // Variabel untuk melanjutkan memesan
        List<Penjualan> daftarPenjualan = new ArrayList<>(); // List untuk menyimpan penjualan

        while (pesanLagi) { // Looping untuk memesan lebih banyak item
            tampilkanMenuRapih(menu); // Menampilkan menu makanan

            System.out.print("Pilih nomor makanan yang ingin dipesan: ");
            int pesananId = input.nextInt(); // Meminta input nomor menu

            if (pesananId > 0 && pesananId <= menu.getJumlahMenu()) { // Memeriksa apakah nomor menu valid
                System.out.print("Jumlah pesanan: ");
                int jumlahPesanan = input.nextInt(); // Meminta input jumlah pesanan

                boolean berhasil = menu.pesanMakanan(pesananId - 1, jumlahPesanan); // Memesan makanan

                if (berhasil) { // Jika pesanan berhasil
                    System.out.println("Pesanan berhasil!");
                    Produk pesanan = menu.getMenuByIndex(pesananId - 1); // Mengambil objek menu yang dipesan
                    double hargaPerItem = pesanan.getHarga();
                    double subtotal = hargaPerItem * jumlahPesanan;
                    // Menambahkan penjualan ke daftar penjualan
                    daftarPenjualan.add(new Penjualan(pesanan.getNamaProduk(), jumlahPesanan, hargaPerItem, subtotal));
                }

                // Konfirmasi apakah ingin memesan menu lainnya
                System.out.print("Apakah ingin memesan menu lainnya? (ya/tidak): ");
                String pesanLagiStr = input.next();
                pesanLagi = pesanLagiStr.equalsIgnoreCase("ya");
            } else {
                System.out.println("Menu tidak tersedia!"); // Pesan jika nomor menu tidak valid
            }
        }

        // Menampilkan menu yang dipesan beserta total bayarnya
        System.out.println("\nDaftar Pesanan:");
        double totalBayar = 0.0;
        String formatHeader = "%-4s %-25s %-10s %-15s %-15s%n";
        String formatRow = "%-4d %-25s %-10s %-15s %-15s%n";
        System.out.printf(formatHeader, "No", "Nama Menu", "Jumlah", "Harga per Item", "Total Harga");
        for (int i = 0; i < daftarPenjualan.size(); i++) { // Looping melalui daftar penjualan
            Penjualan penjualan = daftarPenjualan.get(i);
            // Menampilkan detail penjualan
            System.out.printf(formatRow, i + 1, penjualan.getNamaProduk(), penjualan.getJumlah(),
                    "Rp. " + penjualan.getHargaPerItem(), "Rp. " + penjualan.getHargaTotal());
            totalBayar += penjualan.getHargaTotal(); // Menghitung total bayar
        }
        System.out.println("Total Bayar: Rp. " + totalBayar); // Menampilkan total bayar

        System.out.println("\nTERIMA KASIH SUDAH BERBELANJA"); // Pesan terima kasih
        // Tampil ulang menu setelah pesanan
    }

    // Metode untuk menampilkan menu dengan rata kiri dan kanan
    private static void tampilkanMenuRapih(Restaurant menu) {
        System.out.println("Menu Makanan:");
        String formatHeader = "%-4s %-25s %-15s %-15s%n";
        System.out.printf(formatHeader, "No", "Nama Menu", "Harga", "Stok");
        for (int i = 0; i < menu.getJumlahMenu(); i++) { // Looping melalui menu makanan
            Produk menuMakanan = menu.getMenuByIndex(i);
            // Menampilkan detail menu makanan
            System.out.printf(formatHeader, (i + 1), menuMakanan.getNamaProduk(),
                    "Rp. " + menuMakanan.getHarga(), menuMakanan.getQty());
        }
    }
}


class Penjualan {
    private final String namaProduk; // Variabel untuk menyimpan nama produk yang dijual
    private final int jumlah; // Variabel untuk menyimpan jumlah produk yang dibeli
    private final double hargaPerItem; // Variabel untuk menyimpan harga per item produk
    private final double hargaTotal; // Variabel untuk menyimpan total harga penjualan
    public Penjualan(String namaProduk, int jumlah, double hargaPerItem, double hargaTotal) {
        this.namaProduk = namaProduk; // Menginisialisasi nama produk
        this.jumlah = jumlah; // Menginisialisasi jumlah produk
        this.hargaPerItem = hargaPerItem; // Menginisialisasi harga per item produk
        this.hargaTotal = hargaTotal; // Menginisialisasi total harga penjualan
    }
    public String getNamaProduk()  {
        return namaProduk; // Mengembalikan nama produk
    }
    public int getJumlah() {
        return jumlah; // Mengembalikan jumlah produk yang dibeli
    }
    public double getHargaPerItem() {
        return hargaPerItem; // Mengembalikan harga per item produk
    }
    public double getHargaTotal() {
        return hargaTotal; // Mengembalikan total harga penjualan
    }
}

