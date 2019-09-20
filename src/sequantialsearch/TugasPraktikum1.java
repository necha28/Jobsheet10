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
public class TugasPraktikum1 {
    public static void main(String[] args){
        int cari;
        int a = 0;
        int[] data = new int[]{74,98,72,74,72,90,81,72};
        System.out.println("Data pada array:");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"\t");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        cari = input.nextInt();
        for(int i = 0; i < data.length; i++){
            if(cari == data[i]){
            a++;
            }
        }
        if (a == 0){
            System.out.println("Data tidak ditemukan!");
        } else{
            System.out.println("Data yang dicari ditemukan sebanyak: "+a+ " kali");
        }
    }
 }


