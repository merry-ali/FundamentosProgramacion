package PRACTICA_CONCURSO.FACIL;
//Crea una única función (importante que sólo sea una)
// que sea capaz de calcular y retornar el área de un polígono.
//- La función recibirá por parámetro sólo UN polígono a la vez.
//- Los polígonos soportados serán Triángulo y Rectángulo.
//- Imprime el cálculo del área de un polígono de cada tipo

import javax.swing.JOptionPane;

public class ejercicio2 {

    public static double calcularPoligono(String tipo, double base, double altura) {
        double areaT;
        double areaR;
        if (tipo.equalsIgnoreCase("Triangulo")) {
            return areaT=(base*altura)/2;
        } else if (tipo.equalsIgnoreCase("Rectangulo")) {
            return areaR=base*altura;
        } else {
            JOptionPane.showMessageDialog(null, "ERROR DE TIPO");
            return 0;
        }

    }

    public static void main(String[] args) {

        double baseT=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo"));
        double alturaT=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo"));
        double areatriangulo= calcularPoligono("Triangulo", baseT, alturaT);
        JOptionPane.showMessageDialog(null, "el area del triangulo es "+areatriangulo);

        double baseR=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo"));
        double alturaR=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo"));
        double arearectangulo= calcularPoligono("Rectangulo", baseR, alturaR);
        JOptionPane.showMessageDialog(null, "el area del triangulo es "+arearectangulo);
        



    }
    
}
