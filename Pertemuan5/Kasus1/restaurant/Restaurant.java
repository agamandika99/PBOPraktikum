package restaurant; // Mendefinisikan paket (package) tempat class Restaurant berada

import java.util.logging.Level;
import java.util.logging.Logger;

public class Restaurant { // Mendefinisikan class Restaurant
    private final String[] namaMakanan; // Mendefinisikan array untuk menyimpan nama makanan
    private final double[] hargaMakanan; // Mendefinisikan array untuk menyimpan harga makanan
    private final int[] stok; // Mendefinisikan array untuk menyimpan stok makanan
    private static byte id = 0; // Mendefinisikan ID makanan, menggunakan tipe byte
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName()); // Mendefinisikan logger

    public Restaurant() { // Konstruktor class Restaurant
        namaMakanan = new String[10]; // Membuat array namaMakanan dengan kapasitas 10
        hargaMakanan = new double[10]; // Membuat array hargaMakanan dengan kapasitas 10
        stok = new int[10]; // Membuat array stok dengan kapasitas 10
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) { // Method untuk menambahkan menu makanan
        this.namaMakanan[id] = nama; // Menyimpan nama makanan ke dalam array
        this.hargaMakanan[id] = harga; // Menyimpan harga makanan ke dalam array
        this.stok[id] = stok; // Menyimpan stok makanan ke dalam array
        nextId(); // Memanggil method nextId untuk mengganti ID berikutnya
    }

    public void tampilMenuMakanan() { // Method untuk menampilkan menu makanan
        for (int i = 0; i < id; i++) { // Mengulang dari 0 hingga ID terakhir
            if (!isOutOfStock(i)) { // Memeriksa apakah makanan dalam stok
                logger.log(Level.INFO, "{0} [{1}] \tRp. {2}", new Object[]{namaMakanan[i], stok[i], hargaMakanan[i]});
                // Melakukan pencatatan log untuk menampilkan nama, stok, dan harga makanan
            }
        }
    }

    public boolean pesanMakanan(Pemesanan pesanan) { // Method untuk melakukan pemesanan makanan
        int pesananId = pesanan.getIdMakanan(); // Mendapatkan ID makanan dari objek Pemesanan
        int jumlah = pesanan.getJumlah(); // Mendapatkan jumlah pesanan dari objek Pemesanan

        if (pesananId < getId()) { // Memeriksa apakah ID makanan yang dipesan valid
            if (stok[pesananId] >= jumlah) { // Memeriksa apakah stok mencukupi untuk pesanan
                stok[pesananId] -= jumlah; // Mengurangi stok makanan sesuai dengan jumlah pesanan
                return true; // Mengembalikan true jika pemesanan berhasil
            } else {
                logger.log(Level.INFO,"Pesanan untuk {0} gagal! Stok tidak mencukupi.",  namaMakanan[pesananId]);
                // Melakukan pencatatan log jika stok tidak mencukupi
                return false; // Mengembalikan false jika pemesanan gagal karena stok tidak mencukupi
            }
        } else {
            logger.log(Level.INFO,"Menu tidak tersedia! Pesanan gagal.");
            // Melakukan pencatatan log jika menu tidak tersedia
            return false; // Mengembalikan false jika ID makanan tidak valid
        }
    }

    public boolean isOutOfStock(int id) { // Method untuk memeriksa apakah stok makanan habis
        return stok[id] == 0; // Mengembalikan true jika stok habis, false jika masih ada stok
    }

    private static void nextId() { // Method untuk mengganti ID makanan berikutnya
        id++; // Menambahkan ID makanan
    }

    public static byte getId() { // Method untuk mendapatkan ID makanan saat ini
        return id; // Mengembalikan ID saat ini
    }

    // Getter dan setter untuk mengakses data private
    public String getNamaMakanan(int id) { // Getter untuk mendapatkan nama makanan berdasarkan ID
        return namaMakanan[id]; // Mengembalikan nama makanan
    }

    public double getHargaMakanan(int id) { // Getter untuk mendapatkan harga makanan berdasarkan ID
        return hargaMakanan[id]; // Mengembalikan harga makanan
    }

    public int getStokMakanan(int id) { // Getter untuk mendapatkan stok makanan berdasarkan ID
        return stok[id]; // Mengembalikan stok makanan
    }

    public void setStokMakanan(int id, int stok) { // Setter untuk mengatur stok makanan berdasarkan ID
        this.stok[id] = stok; // Mengatur stok makanan
    }
}
