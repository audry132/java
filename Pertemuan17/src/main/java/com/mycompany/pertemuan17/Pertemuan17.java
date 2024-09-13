/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan17 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah kota dari pengguna
        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Membuat array untuk menyimpan nama-nama kota
        String[] kotaArray = new String[jumlahKota];

        // Menginput nama-nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kotaArray[i] = scanner.nextLine();
        }

        // Menampilkan nama-nama kota yang dimasukkan
        System.out.println("\nKota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }

        // Menutup scanner
        scanner.close();
    }
}

