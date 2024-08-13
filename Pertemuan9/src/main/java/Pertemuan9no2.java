/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Pertemuan9no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai awal dan nilai akhir
        System.out.print("Masukan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.print("Masukan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        System.out.println("Hasil deret bilangan: ");

        // Menampilkan deret bilangan dengan pertambahan 5
        int nilai = awal;
        while (nilai <= akhir) {
            System.out.print(nilai);

            // Jika nilai berikutnya masih dalam range, tambahkan koma
            if (nilai + 5 <= akhir) {
                System.out.print(", ");
            }
            
            nilai += 5;
        }
    }
}

