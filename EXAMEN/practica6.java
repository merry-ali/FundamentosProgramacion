package EXAMEN;
import javax.swing.JOptionPane;

//ingrese tres n umeros y que ordene de mayor a menor 
//{mayor = n1;
//if (n1 <=> iintermedio ) iintermedio = n1;
//if (n1 < menor) menor = n1; 
public class practica6 {
    public static void main(String[] args) {
          
        int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1 "));
        int mayor = n1;
        int menor = n1;
        int intermedio = n1;

        for (int i = 1; i<= 2; i++) {
            n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero " + i));
            if (n1 > mayor){
                intermedio = mayor;
                mayor = n1;
            } else if (n1 < menor) {
                intermedio = menor;
                menor = n1;
            }   else {
                intermedio = n1;
            }    
        }
        JOptionPane.showMessageDialog(null,
        "el numero menor es "+menor+
        "\n el numero intermedio es "+intermedio+
        "\n el numero mayor es "+mayor);

    }
}
