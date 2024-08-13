/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan5 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.println("### Pendataan Karyawan Pt. Petani Kode ###");

        System.out.print("Nama karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Usia: ");
        int usia = scanner.nextInt();

        System.out.print("Gaji: ");
        int gaji = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menampilkan data karyawan
        System.out.println("\nData Karyawan:");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }
}
