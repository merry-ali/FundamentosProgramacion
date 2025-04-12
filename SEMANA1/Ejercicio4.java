package SEMANA1;
//has un programa que solicite tres numeros y calcule su promedio

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null, "ingre la primera nota"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null, "ingre la primera nota"));
        int c=Integer.parseInt(JOptionPane.showInputDialog(null, "ingre la primera nota"));
        
        double promedio=(a+b+c)/3;
        JOptionPane.showMessageDialog(null, "el promedio es: "+promedio);


    }
}
