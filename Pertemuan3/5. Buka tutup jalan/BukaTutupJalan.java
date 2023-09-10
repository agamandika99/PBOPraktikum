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
public class BukaTutupJalan { // deklarasi kelas Java bernama "BukaTutupJalan".

    public static void main(String[] args) { //metode utama (main method) dari program Java, yang akan dieksekusi saat program dijalankan.
        String Hasil;//Deklarasi variabel Hasil yang akan digunakan untuk menyimpan hasil operasi.
        String SatukanAngka; // Deklarasi variabel SatukanAngka yang akan digunakan untuk menyimpan nomor plat kendaraan dalam bentuk string.
        long HasilPlat ; //digunakan untuk menyimpan nomor plat kendaraan dalam bentuk tipe data long setelah beberapa operasi.

        Scanner Scan = new Scanner(System.in); //Membuat objek Scanner bernama "Scan" untuk mengambil input dari pengguna melalui konsol.
        SatukanAngka = Scan.nextLine(); //Membaca satu baris input dari pengguna dan menyimpannya dalam variabel SatukanAngka.

        String[] Konversi = SatukanAngka.split("[ ]+"); //Memecah SatukanAngka menjadi beberapa bagian berdasarkan spasi menggunakan ekspresi reguler [ ]+. Hasilnya disimpan dalam array Konversi
        Hasil = Konversi[0] + Konversi[1] + Konversi[2] + Konversi[3]; //Menggabungkan bagian-bagian nomor plat dalam array Konversi menjadi satu string dan menyimpannya dalam variabel Hasil.
        HasilPlat = Long.parseLong(Hasil); //Mengonversi string Hasil menjadi tipe data long dan menyimpannya dalam variabel HasilPlat.

        HasilPlat -= 999999; //Mengurangkan nilai HasilPlat sebesar 999999.

        if(HasilPlat % 5 != 0 ){ //mengecek apakah HasilPlat tidak habis dibagi 5.
                System.out.println("berhenti"); //Jika HasilPlat tidak habis dibagi 5, maka program mencetak "berhenti" ke layar.
        }else{ //Jika tidak maka
                System.out.println("jalan"); //Jika HasilPlat habis dibagi 5, maka program mencetak "jalan" ke layar.
        }
    }
}
