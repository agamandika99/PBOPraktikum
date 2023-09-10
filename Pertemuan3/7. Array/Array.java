/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Array { //deklarasi kelas Java yang disebut "Array". 
    public static void main(String[] args) { //deklarasi metode utama (main method) yang akan dijalankan ketika program dimulai. 
        // //One Dimensional Arrays
        int[] firstArray = {2, 5, 3}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] secondArray = {9, 5, 3}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] thirdArray = {2, 4, 9}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] fourthArray = {10, 11, 12}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] fifthArray = {13, 14, 15}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] sixthArray = {16, 17, 18}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] seventhArray = {19, 20, 21}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] eighthArray = {22, 23, 24}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        int[] ninthArray = {25, 26, 27}; //deklarasi dan inisialisasi array satu dimensi pertama dengan tiga elemen bilangan bulat.
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray}; // deklarasi dan inisialisasi array dua dimensi pertama yang berisi tiga array satu dimensi.
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray}; // deklarasi dan inisialisasi array dua dimensi pertama yang berisi tiga array satu dimensi.
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray}; // deklarasi dan inisialisasi array dua dimensi pertama yang berisi tiga array satu dimensi.
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3}; //deklarasi dan inisialisasi array tiga dimensi (threeDimensionalArray) yang berisi tiga array dua dimensi (twoDimensionalArray1, twoDimensionalArray2, dan twoDimensionalArray3).
        for(int x = 0; x < 3; x++) { //perulangan pertama dengan variabel x yang digunakan untuk mengiterasi tiga array dua dimensi.
            System.out.print("{"); //mencetak karakter '{' sebagai awal dari setiap baris.
            for(int y = 0; y < 3; y++) { //perulangan kedua dengan variabel y yang digunakan untuk mengiterasi tiga array satu dimensi di dalam setiap array dua dimensi.
                    System.out.print("{"); //mencetak karakter '{' sebagai awal dari setiap baris.
                    for(int z = 0; z < 3; z++) {// perulangan ketiga dengan variabel z yang digunakan untuk mengiterasi tiga elemen dalam setiap array satu dimensi.
                        System.out.print(threeDimensionalArray[x][y][z] + " "); //mencetak nilai dari elemen tiga dimensi pada indeks [x][y][z] diikuti dengan spasi.
                    }
                    System.out.print("} "); // Ini mencetak karakter '}' sebagai akhir dari array satu dimensi yang sedang diiterasi.
            }
            System.out.print("}"); //mencetak karakter '}' sebagai akhir dari array dua dimensi yang sedang diiterasi.
            System.out.println(); //mencetak baris baru untuk mengakhiri setiap baris output.
        }
    }
}
