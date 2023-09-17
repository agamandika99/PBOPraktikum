public class Barang { //deklarasi kelas, dan nama kelasnya adalah "Barang." Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package).
    String kode_barang; //variabel bertipe String yang digunakan untuk menyimpan kode
    String nama_barang; //variabel bertipe String yang digunakan untuk menyimpan nama barang
    private int stok; //variabel bertipe integer yang menyimpan jumlah stok barang. variabel private, yang berarti hanya dapat diakses dari dalam kelas ini sendiri.

    public Barang(String kode, String nama, int stk) { //menerima tiga parameter: kode, nama, dan stk yang digunakan untuk menginisialisasi nilai dari variabel kode_barang, nama_barang, dan stok saat objek dibuat.
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    public int getstock() { //metode yang digunakan untuk mendapatkan nilai dari variabel stok.
        return stok; //mengembalikan nilai dari variabel stok saat dipanggil.
    }

    public void setStok(int stok){ /// metode yang digunakan untuk mengubah nilai variabel stok.
        if(stok > 0){ //Jika stok bilangan bulat positif maka
            this.stok += stok; //stok akan ditambahkan
        }
        else{ //apabila tidak maka
            System.out.println("Tidak boleh kurang dari 0");//akan menampilkan pada layar bahwa stok tidak boleh kurang dari 0.
        }
    }
}
