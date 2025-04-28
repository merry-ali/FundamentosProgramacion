package SEMANA5;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

// el promedio de diez alumnos 
public class ejercicio2 {
    public static void main(String[] args) {
        //tenemos que definir qde que tipo va ser 
        //creamos un nuevo varible
        //[] para declarar que es un array y que esta almacenando 

        int [] nota=new int[2];
        int suma=0;
        //el indice siempre va hacer = 0nunca inici a con 1
        //i seria el indice 
        //nota.length es el tamaño de la nota 
        //un canvio refleje todo el codigo 
        for (int i = 0; i < nota.length; i++) {
           nota[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota "+i));
           //suma = suma+nota[i]; es un acumulador // aqui se acumula la suma anterios y total de todas las notas // el nuevo adto con el anterior
           //contador =contador +1 // solo cuata sus datos 
           suma = suma+nota[i];
           
        }  
        double promedio = suma/nota.length;
        JOptionPane.showMessageDialog(null, "las notas son "+ Arrays.toString(nota)+ 
        "\n Su promedio es "+promedio);
        System.out.println(Arrays.toString(nota));

    }
    
}
