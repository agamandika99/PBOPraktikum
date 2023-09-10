/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BigNumber { // deklarasi kelas utama dengan nama BigNumber.
    public static void main(String[] args) { //deklarasi metode utama (main method) yang akan dijalankan ketika program dimulai.
        Scanner scan = new Scanner(System.in); // inisialisasi objek Scanner yang digunakan untuk membaca input dari pengguna melalui konsol.
        System.out.print("Masukkan angka pertama: "); //mencetak pesan ke layar untuk meminta pengguna memasukkan angka pertama.
        String a = scan.nextLine(); //membaca input dari pengguna sebagai string dan menyimpannya dalam variabel a.
        System.out.print("Masukkan angka kedua: "); //mencetak pesan ke layar untuk meminta pengguna memasukkan angka kedua.
        String b = scan.nextLine(); //membaca input dari pengguna sebagai string dan menyimpannya dalam variabel b.
 
        if ((a.length() > 200) || (b.length() > 200)) { //memeriksa apakah panjang string a atau b melebihi 200 karakter. 
            System.out.println("Anda terlalu banyak dalam menginputkan angka"); //program akan mencetak pesan kesalahan
            System.exit(-1); // keluar menggunakan System.exit(-1).
        }
        
        BigInteger angka1 = new BigInteger(a); //mengkonversi string a menjadi objek BigInteger dan menyimpannya dalam variabel angka1.
        BigInteger angka2 = new BigInteger(b); //mengkonversi string b menjadi objek BigInteger dan menyimpannya dalam variabel angka2.

        if (angka1.compareTo(BigInteger.ZERO) < 0 || angka2.compareTo(BigInteger.ZERO) < 0) { //memeriksa apakah salah satu dari angka1 atau angka2 kurang dari nol (negatif). 
            System.out.println("Angka tidak boleh negatif.");  //program akan mencetak pesan kesalahan
            System.exit(-1); //keluar menggunakan System.exit(-1).
        }

        BigInteger jumlah = angka1.add(angka2); //perhitungan penjumlahan antara angka1 dan angka2 menggunakan metode add dari kelas BigInteger.
        BigInteger kali = angka1.multiply(angka2); //perhitungan perkalian antara angka1 dan angka2 menggunakan metode multiply dari kelas BigInteger.

        System.out.println(jumlah + "\n" + kali); //mencetak hasil penjumlahan dan perkalian ke layar. Angka-angka tersebut dikonversi menjadi string dan dipisahkan dengan baris baru (\n).
    }
}