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
public class Lat5_DemoThrows {
public static void uji(int angka)throws NullPointerException,ArithmeticException{
    if(angka <0){
        throw new NullPointerException("Kesalahan : Null Pointer Exception");
    }
    else{
        throw new ArithmeticException("Kesalahan : Arithmetic Exception");
    }
    
}   
public static void main(String[] args){
    try{
        uji(-12);
        uji(0);
    }
    catch(Exception e){
        System.out.println("Exception ditangkap di sini...");
        System.out.println(e);}

System.out.println("Statemen setelah blok try-catch");
}
}