package tasktiga;

public class Employee implements Sortable {
    // Variabel instance untuk menyimpan data karyawan
    private String name;         // Nama karyawan
    private double salary;       // Gaji karyawan
    private int hireday;         // Hari perekrutan
    private int hiremonth;       // Bulan perekrutan
    private int hireyear;        // Tahun perekrutan

    // Konstruktor untuk membuat objek Employee dengan data awal
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    // Metode untuk mencetak informasi karyawan
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Metode untuk menaikkan gaji karyawan berdasarkan persentase
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // Metode untuk mendapatkan tahun perekrutan karyawan
    public int hireYear() {
        return hireyear;
    }

    // Metode yang diimplementasikan dari antarmuka Sortable untuk membandingkan karyawan berdasarkan gaji
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }
}


