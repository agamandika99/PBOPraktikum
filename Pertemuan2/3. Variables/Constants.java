/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */
public class Constants { // awal dari definisi kelas Java yang disebut "Constants."
  public static void main(String[] args) { //metode utama (main method) yang akan dijalankan saat program dimulai. Semua perintah program utama ditempatkan di dalam metode ini.
    final double CM_PER_INCH = 2.54; //deklarasi variabel konstan. Variabel CM_PER_INCH dideklarasikan sebagai konstanta dengan kata kunci final, yang berarti nilainya tidak dapat diubah setelah inisialisasi. Nilai konstan ini adalah 2.54, yang digunakan untuk mengkonversi inci ke sentimeter.
    double paperWidth = 8.5; //deklarasi variabel paperWidth yang menyimpan lebar kertas.
    double paperHeight = 11; //deklarasi variabel paperHeight yang menyimpan tinggi kertas.
    System.out.println("Paper size in centimeters: " + //perintah untuk mencetak hasil perhitungan ukuran kertas dalam sentimeter ke konsol. Nilai lebar dan tinggi kertas dikalikan dengan konstanta CM_PER_INCH untuk mengonversi dari inci ke sentimeter, dan hasilnya dicetak dalam bentuk kalimat.
    paperWidth * CM_PER_INCH + " by " + paperHeight *
    CM_PER_INCH);
    }   
}
