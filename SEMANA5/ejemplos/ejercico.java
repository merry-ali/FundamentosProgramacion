package SEMANA5.ejemplos;

import javax.swing.JOptionPane;

public class ejercico {
    public static void main(String[] args) {
        int[] numero= {1,2,3,4,5};
        for (int i = 0; i < numero.length; i++) {
            numero[2]=Integer.parseInt(JOptionPane.showInputDialog("numero"));
        }

    }
}
