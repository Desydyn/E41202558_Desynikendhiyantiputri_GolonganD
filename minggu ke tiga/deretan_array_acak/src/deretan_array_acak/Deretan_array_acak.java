/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretan_array_acak;
import java.util.Scanner;
/**
 *
 * @author Desy Niken Dhiyanti Putri
 */
public class Deretan_array_acak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nilai = new Scanner(System.in);
        int jumlahderet = 0;
        System.out.print("Masukkan jumlah deret = ");
        jumlahderet = nilai.nextInt();
        int[] deretan_array = new int[jumlahderet];

        for (int i = 0; i < jumlahderet; i++) {
            deretan_array[i] = (int) (Math.random() * 10);

        }
        for (int j = 0; j < jumlahderet; j++) {
            System.out.print(deretan_array[j] + "\t");
        }
    }
}
