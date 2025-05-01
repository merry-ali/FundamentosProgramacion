package SEMANA5;

import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) {
        int [ ] numeros= {-8,1,0,-9,-2,-1,-3,4,-8};
        int positivos= 0;
        int negativos = 0;
        int cero = 0;
        
        for (int i = 0; i < numeros.length; i++) {
         if (numeros[i]>0) {
            positivos++;
         } else if (numeros[i]<0) {
            negativos++;
         }else {
            cero ++;
         }  
        }
        System.out.println("numeros positivos "+ positivos);
        System.out.println("numeros negativos "+ negativos);
        System.out.println("numeros cero "+ cero);

    }
}
