/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan13v2;

/**
 *
 * @author hp
 */

public class Pertemuan13v2 {
    private double alas;
    private double tinggi;
    private double luas;

    // Constructor
    public Pertemuan13v2(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = hitungLuas(alas, tinggi);
    }

    // Method overloading: menghitung luas dengan dua parameter
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Method overloading: menghitung luas dengan satu parameter (asumsi sama dengan alas dan tinggi)
    public double hitungLuas(double sisi) {
        return (sisi * sisi) / 2;
    }

    // Getter untuk atribut
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLuas() {
        return luas;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + luas);
    }

    // Menambahkan metode main
    public static void main(String[] args) {
        // Membuat objek segitiga dengan alas dan tinggi
        Pertemuan13v2 segitiga = new Pertemuan13v2(10, 5);
        segitiga.tampilkanInfo();

        // Menghitung luas dengan method overloading
        double luasSegitiga = segitiga.hitungLuas(6);
        System.out.println("Luas segitiga dengan sisi 6: " + luasSegitiga);
    }
}
