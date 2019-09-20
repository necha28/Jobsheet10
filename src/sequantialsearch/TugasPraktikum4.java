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
public class TugasPraktikum4 {
    public static void main(String[] args){
        Scanner kalimat = new Scanner(System.in);
        int a,b,c,d,e;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        String hk,al = new String();
        
        System.out.print("Masukkan kalimat/kata : ");
        al = kalimat.nextLine();
        char tchar[] =  new char[al.length()];
        hk = al.toLowerCase();
        for(int x=0; x < al.length(); x++){
            if(hk.charAt(x) == 'a'){
                a++;
            }
            if(hk.charAt(x) == 'i'){
                b++;
            }
            if(hk.charAt(x) == 'u'){
                c++;
            }
            if(hk.charAt(x) == 'e'){
                d++;
            }
            if(hk.charAt(x) == 'o'){
                e++;
        }
    }
        System.out.println("Jumlah huruf a = "+ a);
        System.out.println("Jumlah huruf i = "+ b);
        System.out.println("Jumlah huruf u = "+ c);
        System.out.println("Jumlah huruf e = "+ d);
        System.out.println("Jumlah huruf o = "+ e);
        System.out.println("Jumlah semua huruf vokal = "+ (a+b+c+d+e));
    }
}
