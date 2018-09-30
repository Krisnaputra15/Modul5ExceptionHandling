/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetmodul5;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class DemoInputString {
     public static void main(String args[])throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan nama anda : ");
        String nama = br.readLine();
        System.out.println("Halo " +nama +"! apakah anda sudah mengenal java?");
}
}