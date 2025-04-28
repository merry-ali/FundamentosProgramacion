package PRACTICA_CONCURSO.FACIL;

import javax.swing.JOptionPane;

public class ejercico4 {
    public static void main(String[] args) {
        Double numero=Double.parseDouble(JOptionPane.showInputDialog("ingrese unnumero"));
        int  residuo;
        Double original = numero;
        String binario = "";

        while (numero > 0) {
            residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }

        if (binario == "") {
            binario = "0";
        }

        JOptionPane.showMessageDialog(null, "El número " + original + " en binario es: " + binario);
    }
}
