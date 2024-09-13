/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14;

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

// Child class Kucing yang mengimplementasikan method abstract
class Kucing extends AbstrakHewan {
    // Implementasi method abstract suara
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}

// Child class Anjing yang mengimplementasikan method abstract
class Anjing extends AbstrakHewan {
    // Implementasi method abstract suara
    @Override
    public void suara() {
        System.out.println("Bark");
    }
}

// Main class Pertemuan14 untuk menjalankan program
public class Pertemuan14 {
    public static void main(String[] args) {
        // Membuat objek Kucing dan Anjing
        AbstrakHewan kucing = new Kucing();
        AbstrakHewan anjing = new Anjing();
        
        // Memanggil method suara dan suara2
        kucing.suara();   // Output: Meow
        kucing.suara2();  // Output: Ini method konkrit dari parent class

        anjing.suara();   // Output: Bark
        anjing.suara2();  // Output: Ini method konkrit dari parent class
    }
}
