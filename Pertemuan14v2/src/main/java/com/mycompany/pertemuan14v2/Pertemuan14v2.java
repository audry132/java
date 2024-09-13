/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14v2;

/**
 *
 * @author hp
 */
// Abstract class AbstrakHewan
abstract class AbstrakHewan {
    // Method abstract
    public abstract void suara();

    // Method non-abstract
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Child class Burung yang mengimplementasikan method abstract
class Burung extends AbstrakHewan {
    // Implementasi method abstract suara
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}

// Main class Pertemuan14v2 untuk menjalankan program
public class Pertemuan14v2 {
    public static void main(String[] args) {
        // Membuat objek Burung
        AbstrakHewan burung = new Burung();
        
        // Memanggil method suara
        burung.suara();   // Output: Suara Burung mencicit
    }
}
