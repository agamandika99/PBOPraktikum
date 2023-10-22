package kasuskedua;

public class Sphere extends Shape {
    private final double radius;

    public Sphere(double r) {
        super("Sphere");  // Memanggil konstruktor kelas dasar dengan nama "Sphere"
        radius = r;  // Menginisialisasi atribut radius
    }

    public double area() {
        return 4 * Math.PI * radius * radius;  // Menghitung luas permukaan bola
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;  // Mengembalikan deskripsi bentuk bola
    }
}
