package kasuspertama;

// Ini adalah kelas Hourly yang merupakan turunan dari Employee dan merepresentasikan seorang karyawan yang dibayar per jam.
public class Hourly extends Employee {
    // Variabel instance yang menyimpan jumlah jam kerja.
    private int hoursWorked;

    // Konstruktor untuk menginisialisasi karyawan per jam menggunakan informasi seperti nama, alamat, nomor telepon,
    // nomor asuransi sosial, dan tingkat bayaran per jam.
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        // Memanggil konstruktor kelas dasar (Employee) menggunakan kata kunci "super"
        // untuk menginisialisasi informasi dasar karyawan.
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // Menginisialisasi variabel hoursWorked dengan 0, karena belum ada jam kerja yang ditambahkan.
        hoursWorked = 0;
    }

    // Metode ini digunakan untuk menambahkan jumlah jam kerja.
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    // Metode ini menghitung pembayaran karyawan berdasarkan jumlah jam kerja dan tingkat bayaran per jam.
    // Kemudian mengatur jumlah jam kerja kembali ke 0 setelah pembayaran dihitung.
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    // Metode ini mengembalikan informasi tentang karyawan per jam dalam bentuk string.
    public String toString() {
        // Memanggil metode toString dari kelas dasar (Employee) untuk mendapatkan informasi dasar.
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
