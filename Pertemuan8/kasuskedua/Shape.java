package kasuskedua;

public abstract class Shape {
    protected String shapeName;

    // Konstruktor untuk menginisialisasi atribut shapeName
    protected Shape(String name) {
        shapeName = name;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract double area();

    // Metode toString() yang mengembalikan nama bentuk
    public String toString() {

        return shapeName;
    }
}
