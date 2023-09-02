/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */
public class FloatingPoint { //awal dari definisi kelas Java yang disebut "FloatingPoint."
    public static void main(String[] args) { //metode utama (main method) yang akan dijalankan saat program dimulai.
        double x = 92.98; //Di sini, sebuah variabel x dari tipe data double dideklarasikan dan diinisialisasi dengan nilai 92.98. Variabel ini akan menyimpan nilai floating-point, yaitu nilai dengan titik desimal.
        int nx = (int) Math.round(x); //nilai x diubah menjadi bilangan bulat dengan menggunakan metode Math.round(x). Metode Math.round() mengambil nilai floating-point dan membulatkannya ke bilangan bulat terdekat. Hasil pemutaran tersebut kemudian di-casting (diubah tipe data) menjadi tipe data int dan disimpan dalam variabel nx.
        System.out.println(nx); //perintah untuk mencetak nilai nx ke konsol. Karena nx sudah diubah menjadi bilangan bulat, maka yang akan dicetak adalah nilai hasil pemutaran (pembulatan) dari nilai awal x
    }
}
