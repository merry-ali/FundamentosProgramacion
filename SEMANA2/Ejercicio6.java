package SEMANA2;
//un número entero positivo de tres dígitos,
// escribe un programa que calcule la suma de sus dígitos.

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresen un número"));
        int q = a % 10;
        int w = (a/10) % 10;
        int e = a / 100;

        int suma = q+w+e;
        JOptionPane.showMessageDialog(null, "la suma de digitos es "+suma);


    }
}
