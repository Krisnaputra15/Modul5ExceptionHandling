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
public class DemoInputNumerik2 {
       public static void main(String args[])throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan bilangan riil : ");
        String temp;
        double bilangan = 0;
        temp = br.readLine();
        try{
            bilangan = Double.parseDouble(temp);
        }
        catch (NumberFormatException nfe){
              System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
           System.out.println("Bilangan yang dimasukkan adalah : " +bilangan);
}
}


