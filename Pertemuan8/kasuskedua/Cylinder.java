package kasuskedua;

public class Cylinder extends Shape {
    private final double radius;
    private final double height;

    public Cylinder(double r, double h) {
        super("Cylinder");  // Memanggil konstruktor kelas dasar dengan nama "Cylinder"
        radius = r;  // Menginisialisasi atribut radius
        height = h;  // Menginisialisasi atribut height
    }

    public double area() {
        return Math.PI * radius * radius * height;  // Menghitung luas permukaan silinder
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;  // Mengembalikan deskripsi bentuk silinder
    }
}
