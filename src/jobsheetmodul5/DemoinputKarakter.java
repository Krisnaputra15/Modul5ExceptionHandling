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
public class DemoinputKarakter {
    public static void main(String args[])throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Masukkan sembarang karakter : ");
        char ch = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah : " +ch);
    }
}
