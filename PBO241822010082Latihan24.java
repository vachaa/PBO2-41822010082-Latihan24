/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010082.latihan24;

import java.util.Scanner;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
public class PBO241822010082Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("FORMAT TUGAS PBO");
        
        Scanner scanner = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
            System.out.print("Masukkan nilai pertama: ");
            int nilai1 = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilai2 = scanner.nextInt();

            if (nilai1 > nilai2) {
                System.out.println("Nilai pertama lebih besar dari nilai kedua.");
            } else if (nilai1 < nilai2) {
                System.out.println("Nilai kedua lebih besar dari nilai pertama.");
            } else {
                System.out.println("Kedua nilai sama besar.");
            }

            System.out.print("Ulangi aktifitas? (ya/tidak): ");
            String jawaban = scanner.next();
            ulangi = jawaban.equalsIgnoreCase("ya");
        }
        // TODO code application logic here
    }
    
}
