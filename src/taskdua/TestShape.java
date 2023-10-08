package taskdua;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape(); // Membuat objek Shape dengan konstruktor default
        System.out.println("Shape 1: " + shape1.toString()); // Menampilkan informasi tentang Shape 1

        Shape shape2 = new Shape("blue", false); // Membuat objek Shape dengan konstruktor yang memerlukan warna dan status pengisian
        System.out.println("Shape 2: " + shape2.toString()); // Menampilkan informasi tentang Shape 2

        // Test Circle class
        Circle circle1 = new Circle(); // Membuat objek Circle dengan konstruktor default
        System.out.println("Circle 1: " + circle1.toString() + " Area: " + circle1.getArea() + " Perimeter: " + circle1.getPerimeter()); // Menampilkan informasi tentang Circle 1, termasuk luas dan keliling

        Circle circle2 = new Circle(2.0); // Membuat objek Circle dengan konstruktor yang memerlukan radius
        System.out.println("Circle 2: " + circle2.toString() + " Area: " + circle2.getArea() + " Perimeter: " + circle2.getPerimeter()); // Menampilkan informasi tentang Circle 2, termasuk luas dan keliling

        Circle circle3 = new Circle(3.0, "red", true); // Membuat objek Circle dengan konstruktor yang memerlukan radius, warna, dan status pengisian
        System.out.println("Circle 3: " + circle3.toString() + " Area: " + circle3.getArea() + " Perimeter: " + circle3.getPerimeter()); // Menampilkan informasi tentang Circle 3, termasuk luas dan keliling

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle(); // Membuat objek Rectangle dengan konstruktor default
        System.out.println("Rectangle 1: " + rectangle1.toString() + " Area: " + rectangle1.getArea() + " Perimeter: " + rectangle1.getPerimeter()); // Menampilkan informasi tentang Rectangle 1, termasuk luas dan keliling

        Rectangle rectangle2 = new Rectangle(4.0, 5.0); // Membuat objek Rectangle dengan konstruktor yang memerlukan lebar dan panjang
        System.out.println("Rectangle 2: " + rectangle2.toString() + " Area: " + rectangle2.getArea() + " Perimeter: " + rectangle2.getPerimeter()); // Menampilkan informasi tentang Rectangle 2, termasuk luas dan keliling

        Rectangle rectangle3 = new Rectangle(6.0, 7.0, "yellow", true); // Membuat objek Rectangle dengan konstruktor yang memerlukan lebar, panjang, warna, dan status pengisian
        System.out.println("Rectangle 3: " + rectangle3.toString() + " Area: " + rectangle3.getArea() + " Perimeter: " + rectangle3.getPerimeter()); // Menampilkan informasi tentang Rectangle 3, termasuk luas dan keliling

        // Test Square class
        Square square1 = new Square(); // Membuat objek Square dengan konstruktor default
        System.out.println("Square 1: " + square1.toString() + " Area: " + square1.getArea() + " Perimeter: " + square1.getPerimeter()); // Menampilkan informasi tentang Square 1, termasuk luas dan keliling

        Square square2 = new Square(3.0); // Membuat objek Square dengan konstruktor yang memerlukan sisi
        System.out.println("Square 2: " + square2.toString() + " Area: " + square2.getArea() + " Perimeter: " + square2.getPerimeter()); // Menampilkan informasi tentang Square 2, termasuk luas dan keliling

        Square square3 = new Square(4.0, "purple", false); // Membuat objek Square dengan konstruktor yang memerlukan sisi, warna, dan status pengisian
        System.out.println("Square 3: " + square3.toString() + " Area: " + square3.getArea() + " Perimeter: " + square3.getPerimeter()); // Menampilkan informasi tentang Square 3, termasuk luas dan keliling

        // Test setWidth() and setLength() in Square
        square3.setWidth(5.0); // Mengatur lebar (dan panjang) Square 3 dengan nilai yang berbeda
        System.out.println("Modified square3: " + square3.toString() + " Area: " + square3.getArea() + " Perimeter: " + square3.getPerimeter()); // Menampilkan informasi tentang Square 3 yang sudah diubah, termasuk luas dan keliling
    }
}



