package SEMANA2;

import javax.swing.JOptionPane;

//Escribe un programa que invierta un número entero de tres dígitos.
public class Ejercicio7 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el número"));
        int a= n%10;
        int b= (n / 10) % 10;
        int c= n/100;
        int invertido=a*100+b*10+c;
        JOptionPane.showMessageDialog(null, "invertido"+invertido);
        
    }
}
