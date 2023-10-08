package tasksatu;

public class Cylinder extends Circle {
    private final double height; // variabel private

    // Konstruktor dengan warna, radius, dan tinggi default
    public Cylinder() {
        super(); // memanggil konstruktor tanpa argumen dari superclass Circle()
        height = 1.0;
    }

    // Konstruktor dengan radius default, warna default, tetapi tinggi yang diberikan
    public Cylinder(double height) {
        super(); // memanggil konstruktor tanpa argumen dari superclass Circle()
        this.height = height;
    }

    // Konstruktor dengan warna default, tetapi radius dan tinggi yang diberikan
    public Cylinder(double radius, double height) {
        super(radius); // memanggil konstruktor superclass Circle(r)
        this.height = height;
    }

    // Metode publik untuk mengambil nilai tinggi
    public double getHeight() {
        return height;
    }

    // Metode getArea() yang di-overridden untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Luas permukaan silinder = 2πrh + 2 * luas dasar
        return 2 * Math.PI * getRadius() * getHeight() + 2 * super.getArea();
    }

    // Metode publik untuk menghitung volume silinder
    // Menggunakan metode getArea() yang di-overridden untuk mendapatkan luas permukaan
    public double getVolume() {
        // Volume silinder = luas dasar * tinggi
        return super.getArea() * getHeight();
    }

    // Metode toString() yang di-overridden untuk memberikan representasi string kustom
    @Override
    public String toString() { // di dalam kelas Cylinder
        return "Cylinder: subclass of " + super.toString() // menggunakan toString() dari Circle
                + " height=" + height;
    }
}
