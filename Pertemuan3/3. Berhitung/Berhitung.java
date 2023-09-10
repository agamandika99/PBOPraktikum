/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Berhitung { //deklarasi kelas Java bernama "Berhitung".

    public static void main(String[] args) { //metode utama (main method) dari program Java, yang akan dieksekusi saat program dijalankan.
        Scanner Scan = new Scanner(System.in); //objek Scanner bernama "Scan" untuk mengambil input dari pengguna melalui konsol.
        String hitung = Scan.nextLine(); //metode dari objek Scanner yang digunakan untuk membaca baris teks lengkap yang dimasukkan oleh pengguna.
        String readString[] = hitung.split("\\s+");  //memecah string hitung menjadi bagian-bagian setiap kali ada satu atau lebih spasi dalam string tersebut.

        int A = Integer.parseInt(readString[0]); //Mengonversi elemen pertama dari array readString (yaitu, angka pertama) menjadi bilangan bulat dan menyimpannya dalam variabel A
        int B = Integer.parseInt(readString[2]); //Mengonversi elemen ketiga dari array readString (yaitu, angka kedua) menjadi bilangan bulat dan menyimpannya dalam variabel B
        int hasil; //akan digunakan untuk menyimpan hasil operasi matematika.

        if (1 <= A && B <= 1000) { //akan mengecek apakah kedua bilangan yang dimasukkan oleh pengguna berada dalam rentang 1 hingga 1000.
            switch (readString[1]) { //akan mengecek apakah operator yang diinputkan oleh pengguna itu ada pada case
                case "+": //ketika operator itu adalah plus (tambah)
                    hasil = A + B; //Maka kedua angka akan dijumlahkan dan akan dimasukkan kedalam variabel hasil
                    System.out.println(hasil); //akan menampilkan pada layar hasil kalkulasi dari kedua angka tersebut
                    break; //akan menyelesaikan switch case ini dan selesai 
                case "-": //ketika operator itu adalah plus (tambah)
                    hasil = A - B; //Maka kedua angka akan dikurangkan dan akan dimasukkan kedalam variabel hasil
                    System.out.println(hasil); //akan menampilkan pada layar hasil kalkulasi dari kedua angka tersebut
                    break; //akan menyelesaikan switch case ini dan selesai 
                case "/": //ketika operator itu adalah plus (tambah)
                    hasil = A / B; //Maka kedua angka akan dibagi dan akan dimasukkan kedalam variabel hasil
                    System.out.println(hasil); //akan menampilkan pada layar hasil kalkulasi dari kedua angka tersebut
                    break; //akan menyelesaikan switch case ini dan selesai 
                case "*": //ketika operator itu adalah plus (tambah)
                    hasil = A * B; //Maka kedua angka akan dikalikan dan akan dimasukkan kedalam variabel hasil
                    System.out.println(hasil); //akan menampilkan pada layar hasil kalkulasi dari kedua angka tersebut
                    break; //akan menyelesaikan switch case ini dan selesai 
                case "%": //ketika operator itu adalah plus (tambah)
                    hasil = A % B; //Maka kedua angka akan dimoduluskan dan akan dimasukkan kedalam variabel hasil
                    System.out.println(hasil); //akan menampilkan pada layar hasil kalkulasi dari kedua angka tersebut
                    break; //akan menyelesaikan switch case ini dan selesai 
                default: //ketika tidak ada operator yang sama pada pengecekan
                    System.out.println("Operator tidak valid"); //akan menampilkan pada layar operator tidak valid
                    break;//akan menyelesaikan switch case ini dan selesai 
            }
        } else { //Jika yang diinputkan melebihi angka 1000 
            System.out.print("Angka tidak valid (1-1000)"); //Maka akan menampilkan angka tidak valid 
        }
    }
}
