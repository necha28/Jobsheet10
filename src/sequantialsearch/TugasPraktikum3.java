/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequantialsearch;

/**
 *
 * @author necha
 */
public class TugasPraktikum3 {
    public static void main(String[] args){
        int[]nilai = new int[]{92,98,76,72,84,101,39};
        System.out.println("Data pada array");
        for(int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("Nilai yang merupakan kelipatan tiga : ");
        for(int j = 0; j < nilai.length; j++) {
            if(nilai[j]%3 == 0){
                System.out.println(nilai[j]);
            }
        }
    }
}