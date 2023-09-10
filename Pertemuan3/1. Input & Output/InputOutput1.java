
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class InputOutput1 { //deklarasi kelas Java bernama "InputOutput1".
    public static void main(String[] args) { //metode utama (main method) dari program Java, yang akan dieksekusi saat program dijalankan.
        Scanner input = new Scanner(System.in); //Membuat objek Scanner bernama "input" untuk mengambil input dari pengguna melalui konsol.
        while(true) { //Memulai loop while yang akan berjalan selamanya (karena kondisi true), sehingga program akan terus membaca input dari pengguna hingga diinterupsi atau hingga kondisi tertentu terpenuhi.
        String s = input.nextLine(); //: Membaca satu baris teks dari pengguna dan menyimpannya dalam variabel s.
            if (s.length() < 1 || s.length() > 400000) { //memeriksa panjang string s. Jika panjang string kurang dari 1 atau lebih dari 400,000 karakter.
                    System.out.print("Inputan diluar batasan"); //Ketika kondisi ini terpenuhi, maka akan muncul pada layar inputan diluar batasan
            } else { //Jika tidak maka:
                    String[] token = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@",0); //Memecah string s menjadi beberapa token (kata) berdasarkan spasi atau karakter tanda baca tertentu, seperti spasi, tanda seru, koma, tanda tanya, titik, garis bawah, tanda kutip, dan simbol "@" menggunakan metode split(). Hasilnya disimpan dalam array token.
                    int n = token.length; // Menghitung jumlah token (kata) dalam array token dan menyimpannya dalam variabel n
                    System.out.println(n); //Mencetak jumlah token (kata) ke layar.
                    for(int index = 0; index < n;index += 1) { //Memulai loop for yang akan mengiterasi melalui setiap token dalam array token.
                            System.out.println(token[index]); // Mencetak setiap token (kata) ke layar dalam baris terpisah.
                    }
                    break; //Mengakhiri loop while karena program hanya akan membaca satu baris input dari pengguna.
            }
        }
    }
}
