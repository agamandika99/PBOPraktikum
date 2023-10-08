package taskdua;

public class Circle extends Shape {
    private double radius;  // Variabel untuk menyimpan nilai radius lingkaran

    // Constructors
    public Circle() {
        super();           // Memanggil konstruktor superclass Shape tanpa argumen
        radius = 1.0;     // Menginisialisasi radius dengan nilai default 1.0
    }

    public Circle(double radius) {
        super();           // Memanggil konstruktor superclass Shape tanpa argumen
        this.radius = radius;  // Menginisialisasi radius dengan nilai yang diberikan saat pembuatan objek
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);   // Memanggil konstruktor superclass Shape dengan warna dan status pengisian yang diberikan
        this.radius = radius;   // Menginisialisasi radius dengan nilai yang diberikan saat pembuatan objek
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;       // Mengembalikan nilai radius
    }

    public void setRadius(double radius) {
        this.radius = radius;  // Mengatur nilai radius dengan nilai yang diberikan
    }

    // Methods
    public double getArea() {
        return Math.PI * radius * radius;  // Menghitung dan mengembalikan luas lingkaran
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;  // Menghitung dan mengembalikan keliling lingkaran
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
        // Menghasilkan representasi string lingkaran dengan radius dan merujuk ke superclass Shape
    }
}


