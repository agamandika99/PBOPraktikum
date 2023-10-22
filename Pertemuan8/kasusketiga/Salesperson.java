package kasusketiga;

public class Salesperson implements Comparable<Salesperson> {
    private final String firstName;
    private final String lastName;
    private final Integer totalSales;

    public Salesperson(String first, String last, int sales) {
        // Menginisialisasi objek Salesperson dengan nama depan, nama belakang, dan total penjualan
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        // Menghasilkan representasi string dari objek Salesperson
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        // Memeriksa apakah objek Salesperson sama dengan objek lain
        if (other instanceof Salesperson) {
            Salesperson otherSalesperson = (Salesperson) other;
            return (lastName.equals(otherSalesperson.getLastName()) && firstName.equals(otherSalesperson.getFirstName()));
        }
        return false;
    }

    public int compareTo(Salesperson other) {
        // Membandingkan objek Salesperson berdasarkan total penjualan, kemudian nama belakang (untuk tie-breaker)
        int result = this.totalSales.compareTo(other.totalSales);
        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
