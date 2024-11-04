/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class hurufbesarkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("run:\nMasukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\nrun:\nMasukkan Kalimat: " + kalimat);
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
        System.out.println("BUILD SUCCESSFUL (total time: 2 minut");
    }
}
