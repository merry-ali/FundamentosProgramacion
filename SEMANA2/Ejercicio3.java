package SEMANA2;

import javax.swing.JOptionPane;

//Escribe un programa que calcule el promedio de tres notas de un estudiante.
public class Ejercicio3 {
    public static void main(String[] args) {
        float a=Float.parseFloat(JOptionPane.showInputDialog("ingrese la primera nota"));
        float b=Float.parseFloat(JOptionPane.showInputDialog("ingrese la primera nota"));
        float c=Float.parseFloat(JOptionPane.showInputDialog("ingrese la primera nota"));
        
        double promedio=(a+b+c)/3;
        JOptionPane.showMessageDialog(null, "el promedio es: "+promedio);
        


    }
}
