package SEMANA5;

import java.util.Arrays;

import javax.swing.JOptionPane;

//revertir numero// invertir numeros
public class ejercicio3 {
    
    public static void main(String[] args) {
        int[] numeros=new int[4];// creacion de un array con un valor de 4
      
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+(i+1)));//ingresar la cantidad de codigo 
        }//Arrays.toString gracias a eso imprimimos el valro de ARRAY
        System.out.println(Arrays.toString(numeros));
        int[] invertido = new int[numeros.length];//creacion de un vestor para invertir un numeros []
        // declaracion de un avariable de inicializando de 0//for invertido que inicia desde el final de numeros hasta final 
        
        int contador=0;
        //int i = numeros.length-1 toma la cantidad de numros pero menos 1 por que lo aumenta mas uno
        //i >= 0// tiene que ser mayor  a 0
        //i--// en uncontador al reves osea menos uno 
        
        for (int i = numeros.length-1; i >= 0; i--) {
        //invertido[contador] el ultimo elemeto se almacena en el siguiente contador 
        //
            invertido[contador]=numeros[i];
            //contador 
            contador++;
        }
        System.out.println(Arrays.toString(invertido));
        //JOptionPane.showMessageDialog(null, Arrays.toString(numeros)+"\n numeros invertidos "+mayor+" " +menor );
        


    }
}
