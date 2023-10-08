package taskdua;

public class Square extends Rectangle {
    // Constructors
    public Square() {
        super();  // Memanggil konstruktor superclass Rectangle tanpa argumen
    }

    public Square(double side) {
        super(side, side);  // Memanggil konstruktor superclass Rectangle dengan panjang dan lebar yang sama
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Memanggil konstruktor superclass Rectangle dengan panjang, lebar, warna, dan status pengisian yang diberikan
    }

    // Override toString() to describe a Square
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
        // Menghasilkan representasi string persegi dengan sisi yang sama dan merujuk ke superclass Rectangle
    }

    // Override setWidth() and setLength() to maintain square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);   // Mengatur lebar dengan nilai sisi yang sama
        super.setLength(side);  // Mengatur panjang dengan nilai sisi yang sama
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);   // Mengatur lebar dengan nilai sisi yang sama
        super.setLength(side);  // Mengatur panjang dengan nilai sisi yang sama
    }
}


