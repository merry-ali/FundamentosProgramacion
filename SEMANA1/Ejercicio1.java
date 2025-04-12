// suma de dos numeros 
package SEMANA1;
import javax.swing.JOptionPane;

public class Ejercicio1 {

     public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer número"));
        int suma = a+b;
        JOptionPane.showMessageDialog(null, "la suma de los dos numeros es " +suma);


     }
}