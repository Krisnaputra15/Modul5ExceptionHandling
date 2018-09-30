/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetmodul5;

/**
 *
 * @author ASUS
 */
public class Lat5_2panggil {
    public static void main(String [] args){
        Lat5_2DataMHS z = new Lat5_2DataMHS();
        z.setNim("823784019840404");
        z.setNama("Rudi");
        z.setNilai(80);
        
      System.out.println("NIM : "+z.getNim() );
      
      System.out.println("Nama : " + z.getNama());
      System.out.println("Nilai : " +z.getNilai());
    }
}
