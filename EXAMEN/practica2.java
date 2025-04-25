package EXAMEN;

import java.util.Scanner;

public class practica2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los valores de los catetos
        System.out.print("Ingresa el valor del primer cateto (a): ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el valor del segundo cateto (b): ");
        double b = sc.nextDouble();

        // Calculamos la hipotenusa usando la fórmula de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Mostramos el resultado
        System.out.println("La hipotenusa es: " + hipotenusa);

        sc.close();
    }
}
