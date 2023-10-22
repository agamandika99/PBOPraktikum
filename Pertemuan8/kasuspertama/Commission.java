package kasuspertama;

// Kelas Commission adalah turunan dari Hourly dan merepresentasikan seorang karyawan yang mendapatkan komisi atas penjualan.
public class Commission extends Hourly {
    // Variabel instance yang menyimpan total penjualan yang telah dilakukan oleh karyawan (dalam bentuk nilai double).
    private double totalSales;
    // Variabel instance yang menyimpan tingkat komisi (dalam bentuk nilai double).
    private final double commissionRate;

    // Konstruktor untuk kelas Commission.
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        // Memanggil konstruktor kelas dasar (Hourly) untuk menginisialisasi informasi dasar karyawan per jam.
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // Menginisialisasi variabel commissionRate dengan tingkat komisi yang diberikan dalam bentuk persentase (0.20 berarti 20% komisi).
        this.commissionRate = commissionRate;
        // Menginisialisasi totalSales ke 0.0 karena belum ada penjualan yang dilakukan.
        totalSales = 0.0;
    }

    // Metode ini digunakan untuk menambahkan jumlah penjualan yang telah dilakukan oleh karyawan.
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override metode pay() dari kelas dasar (Hourly).
    @Override
    public double pay() {
        // Menghitung pembayaran per jam menggunakan metode pay() dari kelas dasar (Hourly).
        double hourlyPayment = super.pay();
        // Menghitung pembayaran komisi berdasarkan total penjualan dan tingkat komisi.
        double commissionPayment = totalSales * commissionRate;
        // Setelah pembayaran dihitung, total penjualan diatur kembali ke 0.0.
        totalSales = 0.0;
        // Mengembalikan total pembayaran, yang terdiri dari pembayaran per jam dan komisi.
        return hourlyPayment + commissionPayment;
    }

    // Override metode toString() dari kelas dasar (Hourly) untuk mencakup informasi tambahan tentang total penjualan.
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales + "\n";
        return result;
    }
}
