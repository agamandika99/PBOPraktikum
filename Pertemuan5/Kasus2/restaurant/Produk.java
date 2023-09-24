package restaurant;

public class Produk {
    private String namaProduk; // Variabel untuk menyimpan nama produk
    private double harga; // Variabel untuk menyimpan harga produk
    private int qty; // Variabel untuk menyimpan stok produk

    public Produk(String namaProduk, double harga, int qty) {
        this.namaProduk = namaProduk; // Menginisialisasi nama produk
        this.harga = harga; // Menginisialisasi harga produk
        this.qty = qty; // Menginisialisasi stok produk
    }

    public String getNamaProduk() {
        return namaProduk; // Mengembalikan nama produk
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk; // Mengubah nama produk
    }

    public double getHarga() {
        return harga; // Mengembalikan harga produk
    }

    public void setHarga(double harga) {
        this.harga = harga; // Mengubah harga produk
    }

    public int getQty() {
        return qty; // Mengembalikan stok produk
    }

    public void setQty(int qty) {
        this.qty = qty; // Mengubah stok produk
    }
}
