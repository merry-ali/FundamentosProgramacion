package SEMANA2;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        double n=Double.parseDouble(JOptionPane.showInputDialog("ingese el monto en soles"));
        double dolar = n*3.64;
        JOptionPane.showMessageDialog(null, "la cantidad  "+dolar+" soles");
    }
}
