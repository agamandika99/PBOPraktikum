package kasuspertama;

// Ini adalah kelas abstrak StaffMember yang akan digunakan sebagai dasar untuk berbagai jenis anggota staf.
abstract public class StaffMember {
    // Variabel instance untuk menyimpan informasi dasar anggota staf
    protected String name;
    protected String address;
    protected String phone;

    // Konstruktor untuk menginisialisasi anggota staf dengan informasi dasar
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    // Metode untuk mengembalikan informasi dasar anggota staf dalam bentuk string
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan untuk menghitung gaji
    public abstract double pay();
}
