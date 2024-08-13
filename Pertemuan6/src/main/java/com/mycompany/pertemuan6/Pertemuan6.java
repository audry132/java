/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan6 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        // Menentukan grade berdasarkan nilai
        String grade;
        if (nilai < 50) {
            grade = "Tidak Lulus";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "D";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
        } else if (nilai >= 80 && nilai < 90) {
            grade = "A";
        } else if (nilai >= 90 && nilai < 100) {
            grade = "A+";
        } else {
            grade = "Data nilai salah";
        }

        // Menutup scanner
        scanner.close();

        // Menampilkan hasil
        System.out.println("Grade: " + grade);
    }
}
