package SEMANA2;
//Escribe un programa que calcule el perímetro de un rectángulo. Usa la fórmula:

import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[] args) {
        float a=Float.parseFloat(JOptionPane.showInputDialog("ingrese la longitud del restangulo"));
        float b=Float.parseFloat(JOptionPane.showInputDialog("ingese el ancho del rectangulo"));
        double perimetro = 2*(a+b);

        JOptionPane.showMessageDialog(null, "el perimetro del rectangulo es: "+perimetro);

    }
}
