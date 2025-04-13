package SEMANA2;	
//Un trabajador gana un salario por hora. Escribe un programa
// que calcule su salario semanal, asumiendo que trabaja 40 horas a la semana.

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el sario por hora"));
        double salario= a*40;
        JOptionPane.showMessageDialog(null, "el salario es "+salario);



    }
}
