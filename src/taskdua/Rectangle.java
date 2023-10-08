package taskdua;

public class Rectangle extends Shape {
    private double width;  // Variabel untuk menyimpan nilai lebar (width) dari persegi panjang
    private double length; // Variabel untuk menyimpan nilai panjang (length) dari persegi panjang

    // Constructors
    public Rectangle() {
        super();         // Memanggil konstruktor superclass Shape tanpa argumen
        width = 1.0;     // Menginisialisasi lebar dengan nilai default 1.0
        length = 1.0;    // Menginisialisasi panjang dengan nilai default 1.0
    }

    public Rectangle(double width, double length) {
        super();         // Memanggil konstruktor superclass Shape tanpa argumen
        this.width = width;   // Menginisialisasi lebar dengan nilai yang diberikan saat pembuatan objek
        this.length = length; // Menginisialisasi panjang dengan nilai yang diberikan saat pembuatan objek
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor superclass Shape dengan warna dan status pengisian yang diberikan
        this.width = width;   // Menginisialisasi lebar dengan nilai yang diberikan saat pembuatan objek
        this.length = length; // Menginisialisasi panjang dengan nilai yang diberikan saat pembuatan objek
    }

    // Getters and setters for width and length
    public double getWidth() {
        return width;      // Mengembalikan nilai lebar
    }

    public void setWidth(double width) {
        this.width = width;  // Mengatur nilai lebar dengan nilai yang diberikan
    }

    public double getLength() {
        return length;     // Mengembalikan nilai panjang
    }

    public void setLength(double length) {
        this.length = length; // Mengatur nilai panjang dengan nilai yang diberikan
    }

    // Methods
    public double getArea() {
        return width * length;  // Menghitung dan mengembalikan luas persegi panjang
    }

    public double getPerimeter() {
        return 2 * (width + length); // Menghitung dan mengembalikan keliling persegi panjang
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
        // Menghasilkan representasi string persegi panjang dengan lebar dan panjang serta merujuk ke superclass Shape
    }
}

