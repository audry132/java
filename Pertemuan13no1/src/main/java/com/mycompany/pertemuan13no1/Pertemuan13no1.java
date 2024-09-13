/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13no1;

/**
 *
 * @author hp
 */
// Parent class Kalkulator
class Kalkulator {
    
    // Method untuk pertambahan dengan 2 parameter
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan dengan 2 parameter
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian dengan 2 parameter
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian dengan 2 parameter
    public int pembagian(int a, int b) {
        return a / b;
    }
}

// Main class Pertemuan13no1 untuk menjalankan program
public class Pertemuan13no1 {
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();
        
        // Mendefinisikan dua angka
        int angka1 = 20;
        int angka2 = 10;

        // Memanggil method untuk operasi matematika
        int hasilTambah = kalkulator.pertambahan(angka1, angka2);
        int hasilKurang = kalkulator.pengurangan(angka1, angka2);
        int hasilKali = kalkulator.perkalian(angka1, angka2);
        int hasilBagi = kalkulator.pembagian(angka1, angka2);

        // Menampilkan hasil
        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}
