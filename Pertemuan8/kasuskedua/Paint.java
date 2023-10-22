package kasuskedua;

public class Paint {
    private final double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);  // Mencetak pesan untuk tujuan ilustrasi
        return s.area() / coverage;  // Menghitung jumlah cat yang diperlukan untuk melukis bentuk
    }
}
