/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO2
 */
public class PBO210119066Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan");
        System.out.print("Masukkan Angka ke-1 = ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 = ");
        kalkulator.value2 = scanner.nextDouble();
        System.out.println(" ");
        System.out.println("Hasil Pertambahan = " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan = " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian = " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian = " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa = " + kalkulator.sisaBilangan());
    }
    
}
