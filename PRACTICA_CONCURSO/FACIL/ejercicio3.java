package PRACTICA_CONCURSO.FACIL;
//* Crea un programa que invierta el orden de una cadena de texto sin usar 
//funciones propias del lenguaje que lo hagan de forma automática.
//- Si le pasamos "Hola mundo" nos retornaría "odnum aloH".

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        String n=String.format(JOptionPane.showInputDialog("ingrese un texto: "));
        String invertido = " ";
    
        for (int i = n.length()-1; i >=0 ; i--) {
            invertido +=n.charAt(i);   
        }       
        System.out.println(invertido);
    }
    
}
