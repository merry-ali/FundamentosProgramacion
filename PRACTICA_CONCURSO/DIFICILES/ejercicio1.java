 package PRACTICA_CONCURSO.DIFICILES;
//Escribe un programa que imprima los 50 primeros números de la sucesión
// de Fibonacci empezando en 0.- La serie Fibonacci se compone por una 
//sucesión de números en la que el siguiente siempre es la suma de los dos 
//anteriores.0, 1, 1, 2, 3, 5, 8, 13...50

import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero "));
        int a =0;
        int b =1;
        int i;
        System.out.println("serie de fobenasi son: "+ n + " terminos");
        for (  i = 0; i < n; i++) {
            System.out.print(" " + a );
           int  sucesion  = a + b ;
            a = b;
            b = sucesion; 

        }
        
         
    }

     
}