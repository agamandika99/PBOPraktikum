/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StringFormatting { //deklarasi kelas utama dengan nama StringFormatting.
    public static void main(String[] args) { //deklarasi metode utama (main method) yang akan dijalankan ketika program dimulai. Itu menerima argumen berupa array dari string (String[] args).
        Scanner scanner = new Scanner(System.in); //inisialisasi objek Scanner yang akan digunakan untuk membaca input dari pengguna.

        List<String> inputStrings = new ArrayList<>(); //inisialisasi objek ArrayList dengan tipe elemen String yang akan digunakan untuk menyimpan string yang diinputkan oleh pengguna.
        List<Integer> inputIntegers = new ArrayList<>(); ///inisialisasi objek ArrayList dengan tipe elemen Integer yang akan digunakan untuk menyimpan bilangan bulat yang diinputkan oleh pengguna.

        int temp = 0; //deklarasi variabel temp dengan nilai awal 0. Variabel ini digunakan untuk menghitung berapa kali pengguna telah menginputkan data.
        while (temp < 3) { //akan berjalan selama temp kurang dari 3.
            if (scanner.hasNext()) { //memeriksa apakah Scanner memiliki input selanjutnya dalam bentuk string.
                inputStrings.add(scanner.next()); //Jika ada input selanjutnya dalam bentuk string, maka string tersebut akan ditambahkan ke dalam inputStrings.
            }
            if (scanner.hasNextInt()) { // kondisi yang memeriksa apakah Scanner memiliki input selanjutnya dalam bentuk bilangan bulat.
                inputIntegers.add(scanner.nextInt()); // Jika ada input selanjutnya dalam bentuk bilangan bulat, maka bilangan bulat tersebut akan ditambahkan ke dalam inputIntegers.
            }
            temp++; //peningkatan nilai temp setiap kali pengguna menginputkan data.
        }

        System.out.println("================================"); //perintah untuk mencetak garis pemisah.
        formatAndPrintInput(inputStrings, inputIntegers); //Pemanggilan metode formatAndPrintInput dengan inputStrings dan inputIntegers sebagai argumen.
        System.out.println("================================"); //perintah untuk mencetak garis pemisah.
    }

    public static void formatAndPrintInput(List<String> inputStrings, List<Integer> inputIntegers) { //deklarasi metode formatAndPrintInput yang menerima dua argumen, yaitu inputStrings dan inputIntegers.
        for (int i = 0; i < inputStrings.size(); i++) { // awal dari loop for yang akan berjalan sebanyak elemen yang ada dalam inputStrings.
            String inputString = inputStrings.get(i); //deklarasi variabel inputString yang akan menyimpan elemen inputStrings pada indeks ke-i.
            int inputInteger = inputIntegers.get(i); //deklarasi variabel inputInteger yang akan menyimpan elemen inputIntegers pada indeks ke-i.
            System.out.printf("%-15s%03d%n", inputString, inputInteger); //perintah untuk mencetak string yang telah diformat sesuai dengan pola yang diberikan. %-15s digunakan untuk format string dengan lebar 15 karakter, dan %03d digunakan untuk format bilangan bulat dengan lebar 3 karakter dan mengisi dengan angka 0 jika kurang dari 3 digit.
        }
    }
}