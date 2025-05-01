package PRACTICA_CONCURSO.FACIL;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        // Recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            int num = i +1;

            // Condiciones de FizzBuzz
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (num % 3 == 0) {
                System.out.println("fizz");
            } else if (num % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
