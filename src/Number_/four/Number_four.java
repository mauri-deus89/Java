/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Number_.four;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Number_four {
    public static void main(String[] args) {
        
        Scanner num=new Scanner(System.in);
        
        int totalsuma=0;
        int totalmedia=0;
        
        int[]numeros = new int[5];
        
       for(int i=0;i<numeros.length;i++){
           System.err.println("Ingrese numeros");
           numeros[i]=num.nextInt();
       }
       for(int i=0;i<numeros.length;i++){
           totalsuma=totalsuma+numeros[i];
           totalmedia=totalsuma/numeros[i];
        
       }
        System.out.println("///Total de la suma de todos los elementos : "+totalsuma);
        System.out.println("///Total de la media aritmetica : "+totalmedia);
    }
}



