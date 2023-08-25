/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.welcome;

/**
 *
 * @author LENOVO
 */
public class Soal1 { //merupakan deksripsi awal dari bahasa java yang mana  Semua kode program Java harus berada dalam satu kelas.
    public static void main(String[] args) { //metode utama pada main yang mana akan dieksekusi ketika program dimulai. Karena setiap program Java harus memiliki metode main. Kemudian menerima parameter dalam bentuk array string(String[] args)
        byte angka1 = 125; //deklarasi variabel angka1 dengan tipe data byte dan nilainya adalah 125. 
        byte angka2 = 6; //deklarasi variabel angka2 dengan tipe data byte dan nilainya adalah 6.
        byte hasil = (byte) (angka1+angka2); //Hasil penambahan akan memiliki tipe data int karena operasi aritmatika pada tipe data byte menghasilkan int. Untuk menyimpan hasilnya ke dalam variabel hasil
        
        System.out.println("Hasil 1 "+hasil); //mencetak hasil penambahan ke layar menggunakan System.out.println(). Hasil penambahan, yaitu variabel hasil
    }
}
