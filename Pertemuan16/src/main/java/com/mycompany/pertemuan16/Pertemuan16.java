/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16;

/**
 *
 * @author hp
 */
// Class abstract yang mendefinisikan operasi aritmatika
abstract class OperasiAritmatika {
    // Method abstract untuk operasi aritmatika
    public abstract double hitung(double a, double b);

    // Method untuk menampilkan hasil
    protected void tampilkanHasil(double hasil) {
        System.out.println("Hasil: " + hasil);
    }
}

// Class Penjumlahan yang meng-extend OperasiAritmatika
class Penjumlahan extends OperasiAritmatika {
    @Override
    public double hitung(double a, double b) {
        return a + b;
    }
}

// Class Pengurangan yang meng-extend OperasiAritmatika
class Pengurangan extends OperasiAritmatika {
    @Override
    public double hitung(double a, double b) {
        return a - b;
    }
}

// Class Perkalian yang meng-extend OperasiAritmatika
class Perkalian extends OperasiAritmatika {
    @Override
    public double hitung(double a, double b) {
        return a * b;
    }
}

// Class Pembagian yang meng-extend OperasiAritmatika
class Pembagian extends OperasiAritmatika {
    @Override
    public double hitung(double a, double b) {
        // Menghindari pembagian dengan nol
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
    }
}

// Class utama Pertemuan16 untuk menjalankan aplikasi
public class Pertemuan16 {
    public static void main(String[] args) {
        // Mendefinisikan bilangan A dan B
        double a = 9.5;
        double b = 2.5;

        // Membuat objek dari setiap operasi
        OperasiAritmatika penjumlahan = new Penjumlahan();
        OperasiAritmatika pengurangan = new Pengurangan();
        OperasiAritmatika perkalian = new Perkalian();
        OperasiAritmatika pembagian = new Pembagian();

        // Menghitung dan menampilkan hasil operasi
        double hasilPenjumlahan = penjumlahan.hitung(a, b);
        double hasilPengurangan = pengurangan.hitung(a, b);
        double hasilPerkalian = perkalian.hitung(a, b);
        double hasilPembagian = pembagian.hitung(a, b);

        penjumlahan.tampilkanHasil(hasilPenjumlahan);
        pengurangan.tampilkanHasil(hasilPengurangan);
        perkalian.tampilkanHasil(hasilPerkalian);
        pembagian.tampilkanHasil(hasilPembagian);
    }
}

