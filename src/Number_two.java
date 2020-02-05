
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Number_two {
    
    public static void main(String[] args) {
        
        Scanner num=new Scanner(System.in);
        
        int totalsuma=0;
        int totalresta=0;
        int totalmultiplicaccion=1;
        
        int[]numeros = new int[10];
        
       for(int i=0;i<numeros.length;i++){
           System.err.println("Ingrese 10 numeros");
           numeros[i]=num.nextInt();
       }
       for(int i=0;i<numeros.length;i++){
           totalmultiplicaccion=totalmultiplicaccion*numeros[i];
           totalsuma=totalsuma+numeros[i];
           totalresta=numeros[0]-numeros[1];
        
       }
        System.out.println("///Total de la multiplicación de todos los elementos : "+totalmultiplicaccion);
        System.out.println("///Total de la suma de todos los elementos : "+totalsuma);
        System.out.println("///Total de la resta de todos los elementos : "+totalresta);
        
    }
}
