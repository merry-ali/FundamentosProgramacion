package SEMANA1;
//escribe un  programa que convierta grados celsius a fahrenheit

import javax.swing.JOptionPane;

public class Ejercicio3 {
   public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese los grados celsius"));
        int fahrenheit = a*9/5+32;
        JOptionPane.showMessageDialog(null, "los "+a+" grados celsius equivale a "+fahrenheit+" grados Fahrenheit");

   } 
}
