package kasuspertama;

public class Staff {
    StaffMember[] staffList;

    // Konstruktor untuk kelas Staff
    public Staff() {
        // Membuat sebuah array dari objek StaffMember untuk menampung staf.
        staffList = new StaffMember[8];

        // Mengisi array staffList dengan berbagai jenis staf, termasuk Executive, Employee, Hourly, Volunteer, dan Commission.
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Menambahkan dua karyawan berdasarkan komisi (Commissioned employees).
        staffList[6] = new Commission("John", "123 Oak Street", "555-1234", "456-78-9012", 6.25, 0.20);
        staffList[7] = new Commission("Jane", "456 Elm Street", "555-5678", "789-12-3456", 9.75, 0.15);

        // Memberikan bonus kepada Executive dan mengatur jumlah jam kerja serta penjualan untuk karyawan lainnya.
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Commission) staffList[6]).addHours(35); // Mengatur jam kerja Diane menjadi 35
        ((Commission) staffList[7]).addHours(40); // Mengatur jam kerja Commission employee menjadi 40
        ((Commission) staffList[6]).addSales(400);
        ((Commission) staffList[7]).addSales(950);
    }

    // Metode payday() digunakan untuk menghitung dan mencetak pembayaran untuk seluruh staf.
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay();

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid " + amount);
            }
            System.out.println("----------------------");
        }
    }
}
