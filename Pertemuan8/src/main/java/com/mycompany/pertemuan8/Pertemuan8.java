/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan8 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input nilai awal dan nilai akhir dari pengguna
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menampilkan hasil dengan pengulangan for
        System.out.println("Hasilnya:");
        int count = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(count + ". " + i);
            count++;
        }
    }
}

