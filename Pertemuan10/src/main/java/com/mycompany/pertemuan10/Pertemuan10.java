/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10;

/**
 *
 * @author hp
 */
public class Pertemuan10 {
    
    // Method untuk penjumlahan (dari Aritmatika2)
    public int penjumlahan(int a, int b) {
        return a + b;
    }
    
    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    // Method untuk pembagian
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return 0; // Atau bisa menggunakan throw new ArithmeticException("Tidak dapat membagi dengan nol.");
        }
    }
    
    // Method untuk pangkat
    public int pangkat(int a, int b) {
        int hasil = 1;
        for (int i = 1; i <= b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    // Method utama untuk pengujian
    public static void main(String[] args) {
        Pertemuan10 aritmatika = new Pertemuan10();
        
        // Pengujian method
        System.out.println("Penjumlahan: " + aritmatika.penjumlahan(5, 3));
        System.out.println("Pengurangan: " + aritmatika.pengurangan(5, 3));
        System.out.println("Perkalian: " + aritmatika.perkalian(5, 3));
        System.out.println("Pembagian: " + aritmatika.pembagian(6, 3));
        System.out.println("Pangkat: " + aritmatika.pangkat(2, 3));
    }
}
