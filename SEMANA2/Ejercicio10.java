package SEMANA2;

import javax.swing.JOptionPane;

// "Dado un número entero n, calcula la suma de los primeros 
// n números naturales"
public class Ejercicio10 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingese el número"));
        int h=n/3600;
        int m=(n%3600)/60;
        int s=(n%60);
        JOptionPane.showMessageDialog(null, "son las "+h+" horas con "+m+" minutos y "+s+" segundos ");



    }
}