package SEMANA5;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String[] args) {
        int [] numeros={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        String[] reemplazar = {"sist" , "emmas"} ;
        Object[] resultados =new Object[numeros.length];
       
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%7 == 0) {
                resultados[i]= reemplazar[0];
            } else if (numeros[i]%5 == 0) {
                resultados[i]= reemplazar [0];
            }   else {
                resultados[i]=numeros[i];
            }     
        }

        System.out.println(Arrays.toString(resultados));
    }
}
