/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class praktikum1 {
    public static void main(String [] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
         int pilihan = 0;
         String temp = null;
        System.out.println("Kalkulator Sederhana");
        
        System.out.print("Tentukan jenis operasi (tanpa spasi) : ");
        pilihan = br.read();
        
        try{
            pilihan = Integer.parseInt(temp);
        }
        catch (NumberFormatException nfe){
            System.out.println("Maaf perintah tidak ada di dalam sistem");
        }

        switch(pilihan){
            case 1 :
                System.out.print("Masukkan angka : ");
                int angka1 =br.read();
                System.out.print("Masukkan angka lagi : "  );
                int angka2 =br.read();
                System.out.print(+angka1 + " X " +angka2 + " = ");
                int hasil = angka1 * angka2;
              break;
            case 2 :
                System.out.print("Masukkan angka : ");
                int angka3 = br.read();
                System.out.print("Masukkan angka lagi : "  );
                int angka4 =br.read();
                System.out.print(+angka3 + " : " +angka4 + " = ");
                int hasil2 = angka3 / angka4;
                break;
            case 3 :
                System.out.print("Masukkan angka : ");
                int angka5 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka6 = br.read();
                System.out.print(+angka5 + " + " + angka6 + " = ");
                int hasil3 = angka5 + angka6;
                break;
            case 4 :
                System.out.print("Masukkan angka : ");
                int angka7 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka8 = br.read();
                System.out.print(+angka7 + " - " + angka8 +" = ");
                int hasil4 = angka7 - angka8;
                break;
            case 5 :
                System.out.print("Masukkan angka : ");
                int angka9 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka10 = br.read();
                System.out.print(+angka9 + " + " + angka10 + " = ");
                int hasil5 = angka9 % angka10;
                System.out.println(hasil5);
                break;
      
    }
}
}