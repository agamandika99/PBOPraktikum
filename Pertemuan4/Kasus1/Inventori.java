public class Inventori { //Ini adalah deklarasi kelas "Inventori." Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package)
    Barang[] barangs; //sebuah array dari objek-objek kelas "Barang." Ini digunakan untuk menyimpan beberapa barang dalam inventori.
    void initBarang() { //menginisialisasi array barangs dengan dua objek "Barang."
        barangs = new Barang[2]; //membuat 2 buah barang dalam sebuah array
        barangs[0] = new Barang("001", "Baju", 5); //indeks pertama akan dimasukan ke dalam barangs[0]
        barangs[1] = new Barang("002", "Celana", 20); ////indeks kedua akan dimasukan ke dalam barangs[1]
    }
    void showBarang() { //digunakan untuk mencetak informasi tentang barang-barang dalam inventori.
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getstock() + ")"); //mencetak nama barang dan stoknya menggunakan metode getstock() dari objek "Barang." indeks pertama
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getstock() + ")"); //mencetak nama barang dan stoknya menggunakan metode getstock() dari objek "Barang." indeks kedua
    }
    void pengadaan() {
        initBarang(); // menginisialisasi barang-barang dalam inventori menggunakan initBarang()
        barangs[0].setStok(-2); //menambahkan stok barang pertama dengan 7 menggunakan setStok()
        showBarang(); //mencetak informasi tentang barang-barang dalam inventori menggunakan
    }
    public static void main(String[] args) { // titik masuk untuk program.
        Inventori beli = new Inventori(); //objek "Inventori" dengan nama beli
        beli.pengadaan(); // metode pengadaan() dipanggil pada objek tersebut. Ini akan menginisialisasi barang-barang, menambahkan stok, dan mencetak informasi barang.
    }
}
