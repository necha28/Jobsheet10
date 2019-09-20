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
public class Praktikum01 {
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = {"Cemara","Cendana","Jati","Mahoni","Beringin","Kersen","Pinus"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari: ");
        cari = input.nextLine();
        for (int i = 0; i < data.length; i++) {
            if(cari.equalsIgnoreCase(data[i])) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data ditemukan!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }
}
