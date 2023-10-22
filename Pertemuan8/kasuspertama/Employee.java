package kasuspertama;

// Ini adalah kelas Employee yang merupakan turunan dari StaffMember dan merepresentasikan seorang karyawan.
public class Employee extends StaffMember {
    // Variabel-variabel instance yang menyimpan nomor asuransi sosial dan tingkat bayaran karyawan.
    protected String socialSecurityNumber;
    protected double payRate;

    // Konstruktor untuk menginisialisasi seorang karyawan dengan informasi seperti nama, alamat, nomor telepon,
    // nomor asuransi sosial, dan tingkat bayaran.
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        // Memanggil konstruktor kelas dasar (StaffMember) menggunakan kata kunci "super"
        // untuk menginisialisasi nama, alamat, dan nomor telepon karyawan.
        super(eName, eAddress, ePhone);
        // Menginisialisasi variabel socialSecurityNumber dengan nilai yang diberikan saat membuat objek.
        socialSecurityNumber = socSecNumber;
        // Menginisialisasi variabel payRate dengan tingkat bayaran yang diberikan saat membuat objek.
        payRate = rate;
    }

    // Metode ini mengembalikan informasi tentang karyawan dalam bentuk string.
    public String toString() {
        // Memanggil metode toString dari kelas dasar (StaffMember) untuk mendapatkan informasi dasar.
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    // Metode ini mengembalikan tingkat bayaran karyawan.
    public double pay() {
        return payRate;
    }
}
