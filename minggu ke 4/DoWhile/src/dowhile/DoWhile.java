/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author Desy Niken Dhiyanti Putri
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 1;

        System.out.println("       Do_While        ");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");

        System.out.print("     " + angka + " ");
        do {
            angka *= 2;
            if (angka > 100){
                break;
            }
            System.out.print(angka + " ");
        } while (angka < 100);
        System.out.println(""); 
    }
    
}
