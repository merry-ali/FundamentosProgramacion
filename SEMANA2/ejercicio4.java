package SEMANA2;
import javax.swing.JOptionPane;
//Escribe un programa que calcule el precio 
//final de un producto después de aplicarle un descuento del 10%.

public class ejercicio4 {
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto"));
        double liquido =a-(a*10/100);

        JOptionPane.showMessageDialog(null, "el precio final es "+liquido);

        
    }
}
