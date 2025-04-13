package SEMANA2;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor a"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor b"));
        int c=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor c"));
        
        double d= Math.sqrt(b*b-4*a*c);
        double Fgeneral=(-b-d)/2*a;
        double Fgeneral2=(-b+d)/2*a;

        JOptionPane.showMessageDialog(null, 
        "el C.S.{ "+Fgeneral+" , "+Fgeneral2+" }");
    
    
    
    }
}
