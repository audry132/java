/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hp
 */
public class Kalkulator {
    // Method untuk pertambahan dengan dua parameter
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan dengan dua parameter
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian dengan dua parameter
    public int kali(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian dengan dua parameter
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Membuat objek kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Mendefinisikan dua angka
        int a = 20;
        int b = 10;

        // Menghitung hasil
        int hasilTambah = kalkulator.tambah(a, b);
        int hasilKurang = kalkulator.kurang(a, b);
        int hasilKali = kalkulator.kali(a, b);
        int hasilBagi = kalkulator.bagi(a, b);

        // Menampilkan hasil
        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi");
        System.out.println("Pemrograman Berorientasi Objek (Java 1)");
        System.out.println("Sistem Informasi S-1");
        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}
