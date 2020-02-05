
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Number_one {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Determina cuanto sera el espacio
       final int Espacio=10; 
        int num []=new int [Espacio];
        
        rellenarArray (num);
        
        mostrarArray (num);
        
    }
       public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un numero");
            lista[i]=Integer.parseInt(texto);
           
           
       }
   }
        public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor 2"+lista[i]);
           
           
       }
   }
}
      
