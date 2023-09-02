/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author LENOVO
 */
import java.io.*;
import java.util.*;

public class Solution5 { //awal dari definisi kelas Java yang disebut "Solution5."

    public static void main(String[] args) { //metode utama (main method) yang akan dijalankan saat program dimulai.
        
        Scanner sc=new Scanner(System.in); // baris kode yang membuat objek Scanner untuk membaca input dari pengguna melalui konsol.
        String A=sc.next(); //Baris ini digunakan untuk membaca string pertama (A) dari input pengguna.
        String B=sc.next(); //Baris ini digunakan untuk membaca string kedua (B) dari input pengguna.
        
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length()); //Ini mencetak jumlah panjang (jumlah karakter) dari string A dan B ke konsol.
        System.out.println( A.compareTo(B)>0 ? "Yes" : "No" ); //Baris ini membandingkan string A dengan string B menggunakan metode compareTo(). Jika A lebih besar dari B dalam urutan leksikal, maka "Yes" dicetak; jika tidak, "No" dicetak. Ini mengukur urutan leksikal, yang berarti mengurutkan kata berdasarkan urutan huruf dalam alfabet.
        System.out.println( A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()) ); //Baris ini mengambil huruf pertama dari setiap string (A dan B), mengonversinya menjadi huruf besar dengan toUpperCase(), dan kemudian menggabungkannya dengan bagian lain dari string menggunakan substring(). Hasilnya adalah mencetak kedua string dengan huruf pertama dalam huruf besar, dipisahkan oleh spasi.       
    }
}
