package kasuskedua;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double l, double w) {
        super("Rectangle");  // Memanggil konstruktor kelas dasar dengan nama "Rectangle"
        length = l;  // Menginisialisasi atribut length
        width = w;   // Menginisialisasi atribut width
    }

    public double area() {
        return length * width;  // Menghitung luas persegi panjang
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;  // Mengembalikan deskripsi bentuk persegi panjang
    }
}
