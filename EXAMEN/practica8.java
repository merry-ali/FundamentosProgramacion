package EXAMEN;
import javax.swing.JOptionPane;

public class practica8 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1 :"));
        int mayor = n;
        int menor = n;
        for (int i = 2; i <= 10; i++) {
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+" :"));
           
            if (n>mayor) mayor = n;
            if (n<menor) menor = n;
        }
        //control mas alado del cero
        JOptionPane.showMessageDialog(null, "el numero mayor es :" + mayor+" \nel numero menor es :" + menor);
        
    }
    
}
