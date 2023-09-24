package restaurant; // Mendefinisikan paket (package) tempat class Pemesanan berada

public class Pemesanan { // Mendefinisikan class Pemesanan
    private int idMakanan; // Mendefinisikan variabel private untuk ID makanan yang dipesan
    private int jumlah; // Mendefinisikan variabel private untuk jumlah pesanan

    public Pemesanan(int idMakanan, int jumlah) { // Konstruktor class Pemesanan dengan parameter
        this.idMakanan = idMakanan; // Mengatur nilai ID makanan dari parameter
        this.jumlah = jumlah; // Mengatur nilai jumlah pesanan dari parameter
    }

    public int getIdMakanan() { // Getter untuk mendapatkan ID makanan
        return idMakanan; // Mengembalikan nilai ID makanan
    }

    public void setIdMakanan(int idMakanan) { // Setter untuk mengatur ID makanan
        this.idMakanan = idMakanan; // Mengatur nilai ID makanan
    }

    public int getJumlah() { // Getter untuk mendapatkan jumlah pesanan
        return jumlah; // Mengembalikan nilai jumlah pesanan
    }

    public void setJumlah(int jumlah) { // Setter untuk mengatur jumlah pesanan
        this.jumlah = jumlah; // Mengatur nilai jumlah pesanan
    }
}
