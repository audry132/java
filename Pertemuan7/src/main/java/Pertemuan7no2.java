/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan7no2 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("NIM : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA : ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();

        // Membersihkan buffer
        scanner.nextLine(); // Agar bisa menerima input string berikutnya

        System.out.print("PILIH PEMINATAN (M/T/F) : ");
        char peminatan = scanner.nextLine().charAt(0);

        // Menutup scanner
        scanner.close();

        // Nested switch untuk menentukan program studi berdasarkan tahun dan peminatan
        switch (tahun) {
            case 1:
            case 2:
                System.out.println("Tahun " + tahun + ": Belum ada peminatan di tahun ini.");
                break;
            case 3:
            case 4:
                System.out.println("Tahun " + tahun + ": Anda berada di peminatan berikut:");
                switch (peminatan) {
                    case 'M':
                    case 'm':
                        System.out.println("Peminatan: Manajemen");
                        break;
                    case 'T':
                    case 't':
                        System.out.println("Peminatan: Teknologi Informasi");
                        break;
                    case 'F':
                    case 'f':
                        System.out.println("Peminatan: Keuangan");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid.");
                        break;
                }
                break;
            default:
                System.out.println("Tahun yang dimasukkan tidak valid.");
                break;
        }
    }
}

