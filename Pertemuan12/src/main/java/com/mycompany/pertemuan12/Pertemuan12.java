/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12;

/**
 *
 * @author hp
 */
// Parent class Karyawan
// Parent class Karyawan
// Parent class Karyawan
// Parent class Karyawan
class Karyawan {
    String posisi;
    double gaji;
    double bonus;
    double tunjanganMakan;
    double tunjanganTransport;

    // Constructor
    public Karyawan(String posisi, double gaji, double bonus, double tunjanganMakan, double tunjanganTransport) {
        this.posisi = posisi;
        this.gaji = gaji;
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.tunjanganTransport = tunjanganTransport;
    }

    // Method untuk menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("Gaji " + posisi + " : " + gaji);
        System.out.println("Bonus : " + bonus);
        System.out.println("Tunjangan Makan : " + tunjanganMakan);
        System.out.println("Transport : " + tunjanganTransport);
    }
}

// Child class KaryawanTetap
class KaryawanTetap extends Karyawan {
    
    // Constructor untuk KaryawanTetap
    public KaryawanTetap(String posisi, double gaji, double bonus, double tunjanganMakan, double tunjanganTransport) {
        super(posisi, gaji, bonus, tunjanganMakan, tunjanganTransport);
    }

    // Method untuk menghitung total gaji
    public double hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + tunjanganTransport;
    }

    // Method untuk menampilkan gaji total
    public void tampilkanGajiTotal() {
        tampilkanData(); // Panggil method dari parent class untuk tampilkan data
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }
}

// Main class untuk menjalankan program
public class Pertemuan12 {
    public static void main(String[] args) {
        // Membuat objek KaryawanTetap
        KaryawanTetap karyawan1 = new KaryawanTetap("System Analyst", 4000000, 1000000, 400000, 500000);
        
        // Menampilkan data dan gaji total
        karyawan1.tampilkanGajiTotal();
    }
}
