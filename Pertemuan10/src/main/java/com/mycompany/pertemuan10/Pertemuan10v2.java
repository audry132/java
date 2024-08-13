/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan10;

/**
 *
 * @author hp
 */
public class Pertemuan10v2 {
    public static void main(String[] args) {
        // Membuat objek dari class Aritmatika3
        Pertemuan10 aritmatika = new Pertemuan10();
        
        // Menetapkan nilai bilangan1 dan bilangan2
        int bilangan1 = 10;
        int bilangan2 = 2;
        
        // Mengakses dan menampilkan hasil method-method dari Aritmatika3
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        int hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        int hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);

        // Menampilkan hasil operasi
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}

