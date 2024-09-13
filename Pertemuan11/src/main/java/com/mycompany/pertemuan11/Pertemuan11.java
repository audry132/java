/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11;

/**
 *
 * @author hp
 */
public class Pertemuan11{
    String idKaryawan;
    String namaKaryawan;
    String golongan;
    String jabatan;
    double gajiPokok;

    // Constructor dengan parameter
    public Pertemuan11(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }

    public static void main(String[] args) {
        // Membuat objek karyawan dengan constructor
        Pertemuan11 karyawan1 = new Pertemuan11("001", "Budi Santoso", "A", "Manager", 5000000.0);
        
        // Menampilkan data karyawan
        karyawan1.tampilkanData();
    }
}

