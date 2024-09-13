/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18;

/**
 *
 * @author hp
 */
public class Pertemuan18 {
    public static void main(String[] args) {
        // Contoh penggunaan try-catch
        try {
            int[] array = new int[5];
            // Mengakses elemen di luar batas array
            System.out.println("Elemen ke-6: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Contoh penggunaan throw
        try {
            validateAge(15); // Memeriksa usia
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk melempar exception jika usia tidak valid
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus 18 tahun atau lebih.");
        }
        System.out.println("Usia valid: " + age);
    }
}

