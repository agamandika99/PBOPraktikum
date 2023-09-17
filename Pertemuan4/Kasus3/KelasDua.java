public class KelasDua { //deklarasi kelas, dan nama kelasnya adalah "KelasDua" Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar paket (package).
    {
        System.out.println(5); //blok inisialisasi instance dalam kelas "KelasDua." Ketika objek "KelasDua" dibuat, blok ini akan dijalankan dan mencetak 5.
    }
    public static void main(String[] args)
    {
        System.out.println(6); //metode main dalam kelas "KelasDua." Ini adalah titik masuk utama untuk program. Mencetak 6.
        KelasSatu satu = new KelasSatu(); //"KelasSatu" tanpa parameter, yang akan menjalankan konstruktor tanpa parameter dalam "KelasSatu"
        KelasSatu dua = new KelasSatu(10); //Membuat objek "KelasSatu" dengan parameter 10, yang akan menjalankan konstruktor dengan parameter dalam "KelasSatu"
    }
}
