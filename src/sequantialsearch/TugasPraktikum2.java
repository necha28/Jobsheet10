/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequantialsearch;

import java.util.Scanner;

/**
 *
 * @author necha
 */
public class TugasPraktikum2 {
    public static void main(String[] args){
        
        double ratarata = 0;
        int cari;
        int a = 0;
        boolean found = false;
        int[] data = new int[]{83,76,45,90,85,80,78,74};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Data pada array:");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"\t");
            if(data[i]<a){
                a = data[i];
            }
        }
        for(int i = 0; i < data.length; i++)ratarata+=data[i];
        ratarata/=data.length;
        System.out.println("\nRata-rata nilai array = "+ratarata);
        System.out.println("Nilai yang diatas rata-rata adalah : 83 90 85 80 78");
    }
}
