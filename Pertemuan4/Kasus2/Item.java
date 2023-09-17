public class Item { //deklarasi kelas, dan nama kelasnya adalah "Item" Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package).
    private String name; //sebuah variabel instance private name yang hanya dapat diakses dari dalam kelas ini.

    private Item() { //tidak dapat diakses dari luar kelas "Item."
        name = "Ipin"; //Konstruktor ini menginisialisasi nilai variabel name menjadi "Ipin."
    }
    public Item(String name) { //menerima satu parameter name
        this(); //Di dalam konstruktor ini, pertama-tama dipanggil konstruktor private Item() menggunakan this()
        System.out.println(this.name); //nilai variabel name dicetak ke layar menggunakan
    }
}
