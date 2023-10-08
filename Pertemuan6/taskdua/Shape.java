package taskdua;

public class Shape {
    private String color;          // Variabel untuk menyimpan warna bentuk
    private boolean filled;        // Variabel untuk menyimpan status pengisian bentuk (filled atau tidak)

    // Constructors
    public Shape() {
        color = "green";           // Menginisialisasi warna menjadi "green" (default)
        filled = true;             // Menginisialisasi status pengisian menjadi true (default)
    }

    public Shape(String color, boolean filled) {
        this.color = color;        // Menginisialisasi warna dengan nilai yang diberikan saat pembuatan objek
        this.filled = filled;      // Menginisialisasi status pengisian dengan nilai yang diberikan saat pembuatan objek
    }

    // Getters and setters
    public String getColor() {
        return color;              // Mengembalikan nilai warna
    }

    public void setColor(String color) {
        this.color = color;        // Mengatur warna dengan nilai yang diberikan
    }

    public boolean isFilled() {
        return filled;            // Mengembalikan nilai status pengisian
    }

    public void setFilled(boolean filled) {
        this.filled = filled;    // Mengatur status pengisian dengan nilai yang diberikan
    }

    // toString method
    public String toString() {
        String filledStatus = filled ? "filled" : "Not filled";  // Menggunakan kondisi filled untuk menentukan teks "filled" atau "Not filled"
        return "A Shape with color of " + color + " and " + filledStatus;  // Mengembalikan representasi string bentuk dengan warna dan status pengisian
    }
}


