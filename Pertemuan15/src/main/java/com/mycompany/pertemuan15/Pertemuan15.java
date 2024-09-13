/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15;

/**
 *
 * @author hp
 */
public class Pertemuan15 {

    // Class Kalkulator
    public static class Kalkulator {
        

        // Method untuk pertambahan dengan 2 parameter
        public int pertambahan(int a, int b) {
            return a + b;
        }

        // Method untuk pengurangan dengan 2 parameter
        public int pengurangan(int a, int b) {
            return a - b;
        }

        // Method untuk perkalian dengan 2 parameter (float)
        public float perkalian(float a, float b) {
            return a * b;
        }

        // Method untuk pembagian dengan 2 parameter (float)
        public float pembagian(float a, float b) {
            // Menghindari pembagian dengan nol
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                return 0;
            }
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();
        
        // Mendefinisikan parameter
        int angka1 = 20;
        int angka2 = 10;
        float angka3 = 20.5f;
        float angka4 = 10.5f;

        // Memanggil method untuk operasi matematika
        int hasilTambah = kalkulator.pertambahan(angka1, angka2);
        int hasilKurang = kalkulator.pengurangan(angka1, angka2);
        float hasilKali = kalkulator.perkalian(angka3, angka4);
        float hasilBagi = kalkulator.pembagian(angka3, angka4);

        // Menampilkan hasil
        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}

