public class KelasSatu { //deklarasi kelas, dan nama kelasnya adalah "KelasSatu" Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package).
    {
        System.out.println(11); // inisialisasi instance. Ketika objek "KelasSatu" dibuat, blok ini akan dijalankan dan mencetak 11.
    }
    static //inisialisasi statis.
    {
        System.out.println(2); // hanya dieksekusi satu kali ketika kelas "KelasSatu" dimuat ke dalam memori. Mencetak 2.
    }
    public KelasSatu(int i) //konstruktor "KelasSatu" dengan parameter int i.
    {
        System.out.println(3); //Ketika objek "KelasSatu" dengan parameter dibuat, konstruktor ini akan dijalankan dan mencetak 3.
    }
    public KelasSatu() //konstruktor "KelasSatu" tanpa parameter.
    {
        System.out.println(4); //Ketika objek "KelasSatu" tanpa parameter dibuat, konstruktor ini akan dijalankan dan mencetak 4.
    }
}

