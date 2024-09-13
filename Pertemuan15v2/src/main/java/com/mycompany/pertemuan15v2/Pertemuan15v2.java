/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15v2;

/**
 *
 * @author hp
 */
// Class Kalkulator
// Main class Pertemuan15v2 untuk menjalankan program
public class Pertemuan15v2 {

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

    // Class KalkulatorKurang untuk pengurangan
    static class KalkulatorKurang extends Kalkulator {
        // Method untuk pengurangan
        @Override
        public int pengurangan(int a, int b) {
            return super.pengurangan(a, b);
        }
    }

    // Class KalkulatorBagi untuk pembagian
    static class KalkulatorBagi extends Kalkulator {
        // Method untuk pembagian
        @Override
        public float pembagian(float a, float b) {
            return super.pembagian(a, b);
        }
    }

    // Class KalkulatorKali untuk perkalian
    static class KalkulatorKali extends Kalkulator {
        // Method untuk perkalian
        @Override
        public float perkalian(float a, float b) {
            return super.perkalian(a, b);
        }
    }

    public static void main(String[] args) {
        // Membuat objek dari setiap Kalkulator
        KalkulatorKurang kalkulatorKurang = new KalkulatorKurang();
        KalkulatorBagi kalkulatorBagi = new KalkulatorBagi();
        KalkulatorKali kalkulatorKali = new KalkulatorKali();
        
        // Mendefinisikan parameter
        int angka1 = 20;
        int angka2 = 10;
        float angka3 = 20.5f;
        float angka4 = 10.5f;

        // Memanggil method untuk operasi matematika
        int hasilKurang = kalkulatorKurang.pengurangan(angka1, angka2);
        float hasilKali = kalkulatorKali.perkalian(angka3, angka4);
        float hasilBagi = kalkulatorBagi.pembagian(angka3, angka4);

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}
