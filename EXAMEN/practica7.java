package EXAMEN;

import javax.swing.JOptionPane;

public class practica7 {
    
    public static void main(String[] args) {
        int i=0;
        int n1,n2 = 0;
        
        do {
            n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primre numero"));
            n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
            int suma = n1 + n2;
            if (n1 != 0 && n2 !=0 ) {
                JOptionPane.showMessageDialog(null, "la suam de los dos numeros es "+ suma);
            } else {
                JOptionPane.showMessageDialog(null, "uno de los numeros es cero");
            }          
            i++;

        } while (n1 != 0 && n2 != 0);
    }


    
    
}
