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
public class Gaji_Agent { //deklarasi awal dari kelas Java yang disebut "Gaji_Agent".
	public static void main(String[] args) { //metode utama (main method) yang akan dieksekusi ketika program dimulai. Semua perintah utama program akan berada di dalam metode ini. 
		Scanner input = new Scanner(System.in); //inisialisasi objek Scanner yang digunakan untuk membaca input dari pengguna melalui konsol.	
		float primeSalary = 500000; // deklarasi dan inisialisasi variabel primeSalary dengan nilai 500000, yang merupakan gaji pokok awal agen.
		
		System.out.print("Input Jumlah Penjualan : "); //mencetak pesan ke layar untuk meminta pengguna untuk memasukkan jumlah penjualan.
		int totalSale = input.nextInt(); //membaca input dari pengguna yang merupakan jumlah penjualan dan menyimpannya dalam variabel totalSale.		
		float itemPrice = 50000; //deklarasi dan inisialisasi variabel itemPrice dengan nilai 50000, yang merupakan harga barang per item yang dijual oleh agen.		  		
		float achievement = 0; //deklarasi dan inisialisasi variabel achievement dengan nilai awal 0		 
		if(totalSale > 80) //Jika penjualan lebih dari 80 maka
		{
                    achievement =  totalSale * (itemPrice * 35 / 100); //agen akan mendapatkan bonus 35% dari total penjualan.
		}
		else if(totalSale >= 40) //Jika penjualan lebih dari 40
		{
                    achievement =  totalSale * (itemPrice * 25/100); // agen akan mendapatkan bonus 25% dari total penjualan.
		}
		else if(totalSale < 15) //Jika penjualan kurang dari 15
		{
                    achievement = (totalSale - 15) * (itemPrice * 15/100); //agen akan dikenakan denda, dan bonus per penjualan akan direset menjadi 0.
		}
                else{
                    achievement = totalSale * (itemPrice * 10 / 100); //menghitung bonus per penjualan sebagai 10% dari total penjualan (selain kondisi diatas). 
                }
		float totalSalary = primeSalary + achievement; //perhitungan total gaji agen, yang terdiri dari gaji pokok (primeSalary), bonus per penjualan (bonusPerSale), dan bonus/denda berdasarkan prestasi (achievement).		
		System.out.println("Gaji Pokok		: " + primeSalary  //Mencetak hasil dari seluruh perhitungan diatas
				+ "\nBonus / Denda	         : " + achievement);
		System.out.println("Total Gaji		: " + totalSalary);
	}
}