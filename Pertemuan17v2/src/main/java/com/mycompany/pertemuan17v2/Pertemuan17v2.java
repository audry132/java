/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17v2;

/**
 *
 * @author hp
 */
public class Pertemuan17v2 {
    public static void main(String[] args) {
        // Membuat array multidimensi untuk nama negara dan ibukota
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses dan menampilkan informasi negara dan ibukota
        for (int i = 0; i < negaraDanIbukota.length; i++) {
            String negara = negaraDanIbukota[i][0];
            String ibukota = negaraDanIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}
