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
public class Praktikum03 {
    public static void main(String[] args){
        int min = 0;
        int[] data = new int[]{-21,90,92,182,-83,74};
        System.out.println("Data pada array: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"\t");
            if(data[i] > min){
                min = data[i];
            }
        }
        System.out.println("\nData terbesar dari array adalah " + min);
    }
}

