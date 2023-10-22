package kasuspertama;

// Ini adalah kelas Volunteer yang merupakan turunan dari StaffMember dan merepresentasikan seorang relawan.
public class Volunteer extends StaffMember {
    // Konstruktor untuk menginisialisasi seorang relawan dengan informasi dasar
    public Volunteer(String eName, String eAddress, String ePhone) {
        // Memanggil konstruktor kelas dasar (StaffMember) menggunakan kata kunci "super"
        // untuk menginisialisasi nama, alamat, dan nomor telepon relawan.
        super(eName, eAddress, ePhone);
    }

    // Metode untuk menghitung pembayaran relawan; relawan tidak menerima bayaran,
    // sehingga metode ini mengembalikan nilai 0.0
    public double pay() {
        return 0.0;
    }
}
