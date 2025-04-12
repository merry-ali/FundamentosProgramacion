package SEMANA1;
//ingrese un programa que pida el radio de una esfera y calcule su volumen

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingese el radio de la esfera"));
        double volumen=(4.0/3.0)*Math.PI*Math.pow(n, 3);
    
        JOptionPane.showMessageDialog(null, "el volumen de la esfera es "+volumen); 
    }



}
