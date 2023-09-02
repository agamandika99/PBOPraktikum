/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */

import java.util.*;
import java.io.*;

class Solution { //awal dari definisi kelas Java yang disebut "Solution."
    public static void main(String[] args) { //metode utama (main method) yang akan dijalankan pertama kali saat program dimulai. Ini adalah tempat utama di mana program akan dieksekusi.
        Scanner scan = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna melalui konsol.
        int t = scan.nextInt(); //Membaca sebuah bilangan bulat dari input pengguna dan menyimpannya dalam variabel t. Ini adalah jumlah tes yang akan dijalankan.
        for (int i = 0; i < t; i++) { // Memulai loop for yang akan berjalan sebanyak t kali, sesuai dengan jumlah tes yang akan dilakukan.
            try { //Membuka blok try untuk menangani kesalahan yang mungkin terjadi saat membaca dan memeriksa input.
                long x = scan.nextLong(); //Membaca bilangan bulat panjang dari input pengguna dan menyimpannya dalam variabel x.
                System.out.println(x + " can be fitted in:"); //Mencetak pesan yang memberitahu bahwa nilai x dapat dimasukkan ke dalam tipe data tertentu.
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) { //Memulai pengecekan apakah x dapat dimasukkan ke dalam tipe data byte dengan memeriksa apakah nilainya berada dalam rentang nilai yang diperbolehkan untuk tipe data byte.
                    System.out.println("* byte"); //Jika x dapat dimasukkan ke dalam tipe data byte, mencetak pesan yang menunjukkan bahwa nilai tersebut dapat dimasukkan ke dalam tipe data byte.
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) { //Melanjutkan pengecekan untuk tipe data short.
                    System.out.println("* short"); //Mencetak pesan jika nilai x dapat dimasukkan ke dalam tipe data short.
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) { //Melanjutkan pengecekan untuk tipe data int.
                    System.out.println("* int"); //Mencetak pesan jika nilai x dapat dimasukkan ke dalam tipe data int.
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) { //Melanjutkan pengecekan untuk tipe data long.
                    System.out.println("* long"); //Mencetak pesan jika nilai x dapat dimasukkan ke dalam tipe data long.
                }
            } catch (Exception e) { //Memulai blok catch untuk menangani kesalahan jika ada masalah saat membaca atau memeriksa input.
                System.out.println(scan.next() + " can't be fitted anywhere."); //Mencetak pesan yang memberitahu bahwa nilai yang tidak valid tidak dapat dimasukkan ke dalam tipe data mana pun.
            }
        }
        scan.close(); //Menutup objek Scanner untuk menghindari kebocoran sumber daya.
    }
}
