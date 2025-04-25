package PRACTICA_CONCURSO.FACIL;
import javax.swing.JOptionPane;

public class ejemplo2 {
    
    // Una única función para calcular el área
    public static double calcularArea(String tipo, double base, double altura) {
        if (tipo.equalsIgnoreCase("triangulo")) {
            return (base * altura) / 2;
        } else if (tipo.equalsIgnoreCase("rectangulo")) {
            return base * altura;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de polígono no válido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // TRIÁNGULO
        double baseT = Double.parseDouble(JOptionPane.showInputDialog("Base del triángulo:"));
        double alturaT = Double.parseDouble(JOptionPane.showInputDialog("Altura del triángulo:"));
        double areaTriangulo = calcularArea("triangulo", baseT, alturaT);
        JOptionPane.showMessageDialog(null, "Área del triángulo: " + areaTriangulo);

        // RECTÁNGULO
        double baseR = Double.parseDouble(JOptionPane.showInputDialog("Base del rectángulo:"));
        double alturaR = Double.parseDouble(JOptionPane.showInputDialog("Altura del rectángulo:"));
        double areaRectangulo = calcularArea("rectangulo", baseR, alturaR);
        JOptionPane.showMessageDialog(null, "Área del rectángulo: " + areaRectangulo);
    }
    
}
