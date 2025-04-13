package SEMANA2;

import javax.swing.JOptionPane;

// "Dado un número entero n, calcula la suma de los primeros 
// n números naturales"
public class Ejercicio9 {
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("ingese el numero"));
        double n=(numero*(numero+1))/2;
        JOptionPane.showMessageDialog(null,"la suma de sus primeros numeros es: "+n);
    }
}
