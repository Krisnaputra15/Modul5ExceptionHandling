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
public class Lat3multipleCatch {
    public static void main(String[] args){
        try {
        //int a = 3/0;
       args[0]= "Tulungagung";
        int num = Integer.parseInt(args[0]);
        System.out.println("Perintah selanjutnya...");
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);   
        }
        catch(NullPointerException e){
            System.out.println(e); 
        }
        catch (Exception e){
            System.out.println(e); 
        }
    }
    
}
