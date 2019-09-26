/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert1.pkg10118046.latihan13.relational;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menampilkan relasi logika dari dua variable bilangan
 */
public class PBO2PERT110118046Latihan13Relational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int bil1 = 10;
        int bil2 = 20;
        
        System.out.println("a == b = " + (bil1 == bil2));
        System.out.println("a != b = " + (bil1 != bil2));
        System.out.println("a > b = " + (bil1 > bil2));
        System.out.println("a < b = " + (bil1 < bil2));
        System.out.println("b >= a = " + (bil2 >= bil1));
        System.out.println("b <= a = " + (bil2 == bil1));
    }

}
