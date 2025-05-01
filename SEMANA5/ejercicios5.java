package SEMANA5;

import java.util.Arrays;

public class ejercicios5 {
    public static void main(String[] args) {
        int[] numero={1,2,3,4,5,6,7,8,9,10};
        int[] numero2={1,2,3,8,5,6,7,8,9,10};
        int[] numero3={7,2,3,4,5,6,7,8,9,10};
        int[] suma = new int[numero.length];
        int suma1 = 0;
        for (int i = 0; i < suma.length; i++) {
            suma[i]=numero[i]+numero2[i]+numero3[i];
                       
        }
        System.out.println(Arrays.toString(suma));



    }
    
}
