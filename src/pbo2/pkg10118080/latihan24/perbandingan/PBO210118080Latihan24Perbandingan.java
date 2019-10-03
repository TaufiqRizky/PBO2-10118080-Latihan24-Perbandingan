/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program Membandingkan 2 nilai
 */
public class PBO210118080Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int satu,dua;
        String ulangi;                
        System.out.println("======= Program Perbandingan Nilai =======");
        do {            
            System.out.print("Masukan Nilai Pertama\t: ");
            Scanner a = new Scanner(System.in);
            satu= a.nextInt();
            System.out.print("Masukan Nilai Kedua\t: ");
            Scanner b = new Scanner(System.in);
            dua= b.nextInt();
            if (satu > dua)
                System.out.println("Hasil\t: "+satu+" Lebih Besar Dari "+dua);
            else
                System.out.println("Hasil\t: "+satu+" Lebih Kecil Dari "+dua);
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            Scanner c = new Scanner(System.in);
            ulangi = c.next();
            System.out.println("");
        } while ("Ya".equals(ulangi));
    }
    
}
