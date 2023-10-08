package tasksatu;

public class Circle {
    private final double radius; // Radius dari lingkaran
    private String color; // Warna lingkaran

    // Konstruktor pertama (default)
    public Circle() {
        radius = 1.0; // Menginisialisasi radius ke nilai default 1.0
        color = "red"; // Menginisialisasi warna ke "merah"
    }

    // Konstruktor kedua
    public Circle(double r) {
        radius = r; // Menginisialisasi radius dengan nilai 'r'
        color = "red"; // Menginisialisasi warna ke "merah"
    }

    // Konstruktor baru
    public Circle(double r, String color) {
        radius = r; // Menginisialisasi radius dengan nilai 'r'
        this.color = color; // Menginisialisasi warna dengan nilai 'color' yang diberikan
    }

    // Metode getter untuk mengambil nilai radius
    public double getRadius() {
        return radius;
    }

    // Metode untuk menghitung dan mengembalikan luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Metode getter untuk mengambil nilai warna
    public String getColor() {
        return color;
    }

    // Metode setter untuk mengatur nilai warna
    public void setColor(String color) {
        this.color = color;
    }

    // Metode untuk membuat representasi string yang deskriptif dari lingkaran
    public String toString() {
        return "Circle[radius=" + radius + " Color=" + color + "]";
    }
}

