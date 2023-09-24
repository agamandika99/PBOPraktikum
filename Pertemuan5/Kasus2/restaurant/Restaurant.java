package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<Produk> daftarMenu; // Daftar menu makanan disimpan dalam list

    public Restaurant() {
        daftarMenu = new ArrayList<>(); // Inisialisasi daftar menu sebagai ArrayList kosong
    }

    // Method untuk menambahkan menu makanan ke daftar
    public void tambahMenuMakanan(String nama, double harga, int qty) {
        Produk menuMakanan = new Produk(nama, harga, qty); // Membuat objek Produk yang merepresentasikan menu makanan
        daftarMenu.add(menuMakanan); // Menambahkan menu ke daftar
    }

    // Method untuk menampilkan daftar menu makanan
    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:"); // Menampilkan judul "Menu Makanan"
        for (int i = 0; i < daftarMenu.size(); i++) {
            Produk menu = daftarMenu.get(i); // Mendapatkan objek menu
            // Menampilkan detail menu, termasuk nomor menu, nama, stok, dan harga
            System.out.println((i + 1) + ". " + menu.getNamaProduk() + "[" + menu.getQty() + "]" + "\tRp. " + menu.getHarga());
        }
    }

    // Method untuk melakukan pemesanan makanan
    public boolean pesanMakanan(int id, int jumlah) {
        if (id >= 0 && id < daftarMenu.size()) {
            Produk menu = daftarMenu.get(id); // Mengambil objek Produk berdasarkan ID yang dimasukkan
            // Memeriksa apakah stok menu mencukupi untuk pesanan
            if (menu.getQty() >= jumlah) {
                // Mengurangkan stok menu setelah pesanan berhasil
                menu.setQty(menu.getQty() - jumlah);
                return true; // Berhasil melakukan pemesanan
            } else {
                // Mencetak pesan kesalahan jika stok tidak mencukupi
                System.out.println("Pesanan untuk " + menu.getNamaProduk() + " gagal! Stok tidak mencukupi.");
            }
        } else {
            // Mencetak pesan kesalahan jika ID menu tidak valid
            System.out.println("Menu tidak tersedia! Pesanan gagal.");
        }
        return false; // Gagal melakukan pemesanan
    }

    // Method untuk mendapatkan jumlah total menu dalam daftar
    public int getJumlahMenu() {
        return daftarMenu.size(); // Mengembalikan jumlah total menu dalam daftar
    }

    // Method untuk mendapatkan menu berdasarkan indeks
    public Produk getMenuByIndex(int index) {
        if (index >= 0 && index < daftarMenu.size()) { // Memeriksa apakah indeks yang dimasukkan oleh pengguna berada dalam rentang yang valid
            return daftarMenu.get(index); // Mengembalikan objek Produk berdasarkan indeks
        }
        return null; // Mengembalikan null jika indeks tidak valid
    }

    // Method untuk menambahkan menu makanan awal ke dalam daftar
    public void tambahMenuAwal() {
        // Menambahkan beberapa menu makanan awal ke dalam daftar
        tambahMenuMakanan("Bala-Bala", 1_000, 20);
        tambahMenuMakanan("Gehu", 1_000, 20);
        tambahMenuMakanan("Tahu", 1_000, 10);
        tambahMenuMakanan("Molen", 1_000, 15);
        tambahMenuMakanan("Seblak", 10_000, 10);
        tambahMenuMakanan("Bakso", 12_000, 30);
        tambahMenuMakanan("Mie Ayam", 15_000, 10);
        tambahMenuMakanan("Mie Goreng", 9_000, 12);
        tambahMenuMakanan("Ayam Serundeng", 15_000, 10);
        tambahMenuMakanan("Ayam Bakar", 15_000, 16);
        tambahMenuMakanan("Soto Ayam", 10_000, 22);
    }
}
