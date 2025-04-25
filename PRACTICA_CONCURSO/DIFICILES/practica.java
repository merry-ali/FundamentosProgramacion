package PRACTICA_CONCURSO.DIFICILES;

import javax.swing.JOptionPane;

public class practica {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1 :"));
        int mayor = n;
        int menor = n;

        for (int i = 1; i < 10; i++) {
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+ " : "));
            if (n > mayor ) mayor=n;
            if (n < menor ) menor=n;          
        }

        JOptionPane.showMessageDialog(null, "el numero mayor es: "+ mayor);
        JOptionPane.showMessageDialog(null, "el numero menor es: "+ menor);
    }
    
}
