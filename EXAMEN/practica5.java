package EXAMEN;

import javax.swing.JOptionPane;

public class practica5 {
        public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        double suma =0;// contador
       
        for (int i = 0; i <= n1; i++) {
            //suma de digitos 
            suma = suma + i ;   
        }
        double media= suma /n1;
        JOptionPane.showMessageDialog(null, "la media aritmetica es: "+ media );
        

    }
}
