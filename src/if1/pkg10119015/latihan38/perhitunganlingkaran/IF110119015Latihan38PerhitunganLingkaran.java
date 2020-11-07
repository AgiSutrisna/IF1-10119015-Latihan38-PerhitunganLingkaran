/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PerhitunganLingkaran lingkaran = new PerhitunganLingkaran();
        
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true){
            try{
                lingkaran.diameter = Double.parseDouble(input.next());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukan nilai diameter lingkaran : ");
                continue;
            }
        }
        
        double jarijari = lingkaran.hitungJariJari();
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran\t\t= %.2f%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t\t= %.2f%n", luas);
        System.out.printf("Keliling Lingkaran\t\t= %.2f%n", keliling);
    }
    
}
