/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16v2;

/**
 *
 * @author hp
 */
// Superclass untuk operasi aritmatika
class OperasiAritmatika {
    // Method protected untuk operasi aritmatika
    protected double hitung(double a, double b) {
        return 0; // Method default yang bisa di-override oleh subclass
    }

    // Method protected untuk menampilkan hasil
    protected void tampilkanHasil(double hasil) {
        System.out.println("Hasil: " + hasil);
    }
}

// Class Penjumlahan yang meng-extend OperasiAritmatika
class Penjumlahan extends OperasiAritmatika {
    @Override
    protected double hitung(double a, double b) {
        return a + b;
    }
}

// Class Pengurangan yang meng-extend OperasiAritmatika
class Pengurangan extends OperasiAritmatika {
    @Override
    protected double hitung(double a, double b) {
        return a - b;
    }
}

// Class Perkalian yang meng-extend OperasiAritmatika
class Perkalian extends OperasiAritmatika {
    @Override
    protected double hitung(double a, double b) {
        return a * b;
    }
}

// Class Pembagian yang meng-extend OperasiAritmatika
class Pembagian extends OperasiAritmatika {
    @Override
    protected double hitung(double a, double b) {
        // Menghindari pembagian dengan nol
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
    }
}

// Class utama Pertemuan17 untuk menjalankan aplikasi
public class Pertemuan16v2 {
    public static void main(String[] args) {
        // Mendefinisikan bilangan A dan B
        double a = 9.5;
        double b = 2.5;

        // Array untuk menyimpan objek operasi aritmatika
        OperasiAritmatika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        // Melakukan operasi dan menampilkan hasil
        for (OperasiAritmatika op : operasi) {
            double hasil = op.hitung(a, b);
            op.tampilkanHasil(hasil);
        }
    }
}
