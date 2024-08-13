/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Pertemuan4no2 {

    public static void main(String[] args) {
        int w, x, y, z;

        w = 6;
        x = 5;
        y = 8 - x++;  // y = 8 - 6, kemudian x = 7
        z = 8 - ++w;  // w = 6, kemudian z = 8 - 6

        // Menampilkan hasil nilai w, x, y, z
        System.out.println("Nilai w = " + w);
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);
    }
}
