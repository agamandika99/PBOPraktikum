package tasktiga;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee implements Sortable {
    // Variabel instance tambahan khusus untuk Manager
    private String secretaryName;

    // Konstruktor untuk membuat objek Manager dengan data awal
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);  // Memanggil konstruktor superclass (Employee)
        secretaryName = "";    // Menginisialisasi secretaryName
    }

    // Override metode raiseSalary dari Employee untuk menghitung bonus tambahan
    public void raiseSalary(double byPercent) {
        // Mendapatkan tahun saat ini
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);

        // Menghitung bonus berdasarkan tahun perekrutan
        double bonus = 0.5 * (currentYear - hireYear());

        // Memanggil raiseSalary dari superclass (Employee) dengan tambahan bonus
        super.raiseSalary(byPercent + bonus);
    }

    // Metode untuk mendapatkan nama sekretaris
    public String getSecretaryName() {
        return secretaryName;
    }

    // Implementasi metode compare dari antarmuka Sortable untuk membandingkan Manager
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        // Membandingkan karyawan menggunakan metode compare dari superclass (Employee)
        if (super.compare(eb) != 0) {
            return super.compare(eb);
        }
        // Jika gaji sama, bandingkan berdasarkan secretaryName
        return secretaryName.compareTo(((Manager) eb).getSecretaryName());
    }
}



