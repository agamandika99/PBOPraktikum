package kasuskedua;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20, 35); // Membuat objek persegi panjang "deck"
        Sphere bigBall = new Sphere(15); // Membuat objek bola "bigBall"
        Cylinder tank = new Cylinder(10, 30); // Membuat objek silinder "tank"

        double deckAmt = paint.amount(deck); // Menghitung jumlah cat yang diperlukan untuk "deck"
        double ballAmt = paint.amount(bigBall); // Menghitung jumlah cat yang diperlukan untuk "bigBall"
        double tankAmt = paint.amount(tank); // Menghitung jumlah cat yang diperlukan untuk "tank"

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
