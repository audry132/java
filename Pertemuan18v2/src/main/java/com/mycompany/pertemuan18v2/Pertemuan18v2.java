/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18v2;

/**
 *
 * @author hp
 */
public class Pertemuan18v2 {
    public static void main(String[] args) {
        try {
            // Kode ini tidak melempar exception
            Float data = 500f / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            // Blok ini tidak akan dieksekusi karena tidak ada NullPointerException
            System.out.println(e);
        } finally {
            // Blok ini selalu dieksekusi
            System.out.println("Blok finally akan selalu dieksekusi");
        }
    }
}
