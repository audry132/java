/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9;

/**
 *
 * @author hp
 */
public class Pertemuan9 {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) { 
            int j = 1;
            
            while (j <= i) { 
                System.out.print("* ");
                j++;
            }
            
            System.out.println(); // baris baru
            i++;
        }
    }
}
