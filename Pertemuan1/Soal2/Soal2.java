/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.welcome;

/**
 *
 * @author LENOVO
 */
public class Soal2 { //merupakan deksripsi awal dari bahasa java yang mana  Semua kode program Java harus berada dalam satu kelas.
    public static void main(String[] args) { //metode utama pada main yang mana akan dieksekusi ketika program dimulai. Karena setiap program Java harus memiliki metode main. Kemudian menerima parameter dalam bentuk array string(String[] args)
        int i = 42; //deklarasi variabel i dengan tipe data int dan nilai 42.
        String s = (i<40)?"life":(i>50)?"universe":"everything"; //baris di mana variabel s diinisialisasi menggunakan operator ternary. Operator ternary digunakan untuk menghasilkan nilai berdasarkan kondisi. Pada code ini ketika i nya kurang daru 40 akan menampilkan life dan ketika false akan masuk ke dalam ternary selanjutnya yaitu ketika i lebih dari 50 maka akan menampilkan universe dan ketika kurang dari 50 maka akan menampilkan everything
        System.out.println(s); // mencetak nilai dari variabel s ke layar menggunakan System.out.println()
    }
}
