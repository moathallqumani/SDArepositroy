/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implicitandexplicit;

/**
 *
 * @author AD
 */
public class ImplicitANDexplicit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //This for smaller to larger which called implicit
        int i = 10 ;
        long y = i ; 
        //This for larger to smaller which called explicit 
        float x = 1000000000;
        int z = (int)x ;
        //-----------
        System.out.println(i+"\n"+y+"\n---------------\n"+x+"\n"+z);
     
    }
    
}
