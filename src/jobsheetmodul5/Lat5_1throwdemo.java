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
public class Lat5_1throwdemo {
    public static void main (String [] args){
        String input = "Invalid input";
        try{
            if(input.equals("Invalid input")){
                throw new RuntimeException("throw demo");}
            else{
                System.out.println(input);
            }
             System.out.println("After throwing");
        }
      catch(RuntimeException e){
          System.out.println("Exception caught here");
          System.out.println(e);
      }  
    }
}
