/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */
class ConvertDataType //awal dari definisi kelas Java yang disebut "ConvertDataType."
{
    static short methodOne(long l) //deklarasi metode statis bernama methodOne yang menerima parameter l bertipe long dan mengembalikan nilai bertipe short.
    {
       int i = (int) l; //Di dalam metode methodOne, nilai l (yang bertipe long) di-casting (diubah tipe data) menjadi tipe data int dan disimpan dalam variabel i.
       return (short)i; //Metode methodOne mengembalikan nilai i yang telah di-casting menjadi tipe data short.
    }
    public static void main(String[] args) //metode utama (main method) yang akan dijalankan saat program dimulai.
    {
       double d = 10.25; //Dalam metode main, sebuah variabel d dideklarasikan dan diinisialisasi dengan nilai 10.25. Variabel ini bertipe double
       float f = (float) d; //Nilai d di-casting menjadi tipe data float dan disimpan dalam variabel f. Ini adalah contoh casting dari tipe data yang lebih besar (double) ke tipe data yang lebih kecil (float).
       byte b = (byte) methodOne((long) f); //Nilai d di-casting menjadi tipe data float dan disimpan dalam variabel f. Ini adalah contoh casting dari tipe data yang lebih besar (double) ke tipe data yang lebih kecil (float).
       System.out.println(b); //Hasil akhir dari casting dan perhitungan yang dilakukan dalam program dicetak ke konsol.
    }
}

