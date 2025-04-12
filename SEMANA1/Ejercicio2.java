package SEMANA1;
// crea un program que pida al usuario la base 
//y la altura de un rectangulo y calcule su area 

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingesse la base del restangulo"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingre la al altura del rectangulo"));

        int area= a*b;
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+area);
    }
}
