package SEMANA2;
// Escribe un programa que convierta una temperatura dada en grados 
//Celsius a Fahrenheit. Usa la fórmula:

import javax.swing.JOptionPane;

public class Ejercicio {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingese la temperatura"));
        double ferenheit=(9.0/5.0)*a+32;
        JOptionPane.showMessageDialog(null, "la temperatura en equivalente en fahrenheit "+ferenheit);
    }
    
}
