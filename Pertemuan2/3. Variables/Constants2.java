/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */
public class Constants2 { //awal dari definisi kelas Java yang disebut "Constants2."
    public static final double CM_PER_INCH = 2.54; //deklarasi variabel konstan CM_PER_INCH. Variabel ini diberi kata kunci public, static, dan final:
    public static void main(String[] args) { //metode utama (main method) yang akan dijalankan saat program dimulai.
        double paperWidth = 8.5; //deklarasi variabel paperWidth yang menyimpan lebar kertas.
        double paperHeight = 11; //deklarasi variabel paperHeight yang menyimpan tinggi kertas.
        System.out.println("Paper size in centimeters: " + paperWidth * //perintah untuk mencetak hasil perhitungan ukuran kertas dalam sentimeter ke konsol. Nilai lebar dan tinggi kertas dikalikan dengan konstanta CM_PER_INCH untuk mengonversi dari inci ke sentimeter, dan hasilnya dicetak dalam bentuk kalimat.
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
