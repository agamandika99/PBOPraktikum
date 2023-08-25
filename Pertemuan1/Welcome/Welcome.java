/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome;

/**
 *
 * @author LENOVO
 */
public class Welcome { //merupakan deksripsi awal dari bahasa java yang mana  Semua kode program Java harus berada dalam satu kelas.

    public static void main(String[] args) { //metode utama pada main yang mana akan dieksekusi ketika program dimulai. Karena setiap program Java harus memiliki metode main. Kemudian menerima parameter dalam bentuk array string(String[] args)
        String greeting = "Welcome to Core Java!"; //untuk menyimpan pesan "Welcome to Core Java!" sebagai string.				
        System.out.println(greeting); //Mencetak isi dari variabel greeting ke layar dengan menggunakan System.out.println().
        for (int i = 0; i < greeting.length(); i++) //inisialisasi loop for yang akan berjalan dari i = 0 hingga i kurang dari panjang string 
            System.out.print("=");  //karakter "=" akan dicetak berulang kali sesuai dengan panjang string greeting.
        System.out.println(); //Setelah loop selesai, ini mencetak baris baru, sehingga garis pemisah terletak pada baris yang terpisah dari pesan "Welcome to Core Java!".
    }
}
