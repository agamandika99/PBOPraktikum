package kasuspertama;

// Kelas Executive adalah turunan dari Employee dan mewakili seorang eksekutif.
public class Executive extends Employee {
    // Variabel instance yang menyimpan bonus yang diterima oleh eksekutif (dalam bentuk nilai double).
    private double bonus;

    // Konstruktor untuk kelas Executive.
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        // Memanggil konstruktor kelas dasar (Employee) untuk menginisialisasi informasi dasar karyawan.
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // Menginisialisasi bonus ke 0.0 karena belum ada bonus yang diberikan.
        bonus = 0;
    }

    // Metode awardBonus() digunakan untuk memberikan bonus kepada eksekutif.
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    // Override metode pay() dari kelas dasar (Employee).
    public double pay() {
        // Menghitung pembayaran untuk eksekutif, yang terdiri dari pembayaran reguler karyawan plus bonus satu kali.
        double payment = super.pay() + bonus;
        // Setelah pembayaran dihitung, bonus diatur kembali ke 0.0.
        bonus = 0;
        // Mengembalikan total pembayaran.
        return payment;
    }
}
