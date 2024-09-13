/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan11v2 {
    String idKaryawan;
    String namaKaryawan;
    String golongan;
    String jabatan;
    double gajiPokok;

    // Constructor dengan parameter
    public Pertemuan11v2(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("\n--- Data Karyawan ---");
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }

    // Tambahkan main method di kelas Pertemuan11v2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data karyawan
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = scanner.nextLine();
        
        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();
        
        System.out.print("Masukkan Golongan Karyawan (1-5): ");
        String golongan = scanner.nextLine();
        
        // Inisialisasi variabel jabatan dan gajiPokok
        String jabatan = "";
        double gajiPokok = 0;

        // Menentukan jabatan dan gajiPokok berdasarkan golongan menggunakan switch-case
        switch (golongan) {
            case "1":
                jabatan = "Assisten Staff";
                gajiPokok = 3000000;
                break;
            case "2":
                jabatan = "Staff";
                gajiPokok = 3500000;
                break;
            case "3":
                jabatan = "Supervisor";
                gajiPokok = 4000000;
                break;
            case "4":
                jabatan = "Assisten Manager";
                gajiPokok = 5000000;
                break;
            case "5":
                jabatan = "Manager";
                gajiPokok = 6000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                System.exit(0);
        }
        
        // Membuat objek Pertemuan11v2 dan mengirim data ke constructor
        Pertemuan11v2 karyawan = new Pertemuan11v2(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);
        
        // Menampilkan data karyawan
        karyawan.tampilkanData();
        
        scanner.close();
    }
}