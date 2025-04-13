package SEMANA2;
//Escribe un programa que 
//calcule el área de un círculo a partir de su radio. Usa la fórmula:

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el area del circulo"));
        double area=Math.PI*Math.pow(a, 2);

        JOptionPane.showMessageDialog(null, "el area del circulo es "+area);
    
    }
    
}
