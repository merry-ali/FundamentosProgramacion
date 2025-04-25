package PRACTICA_CONCURSO.DIFICILES;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

//* Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
//  - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
//  - La función recibirá dos String y retornará un Int.
//  - La diferencia en días será absoluta (no importa el orden de las fechas).
// - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.

public class ejercicio2 {

    public static int diasenteFechas(String F1, String F2) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yy");
        Date fecha1 = formato.parse(F1);
        Date fecha2 = formato.parse(F2);

        Long milisDiff = Math.abs(fecha1.getTime()-fecha2.getTime());
        return (int) (milisDiff / (1000 * 60 * 60 * 24));

        
    }

    public static void main(String[] args) {

          try {
            String fecha1=String.format(JOptionPane.showInputDialog(null, "ingrese la primera fecha dd/MM/yy "));
            String fecha2=String.format(JOptionPane.showInputDialog(null, "ingrese la segunda fecha dd/MM/yy "));

            int diferencia=diasenteFechas(fecha1, fecha2);
            
            JOptionPane.showMessageDialog(null, "diferencia de fechas es de "+ diferencia);

         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "fecha invalida ");
            // TODO: handle exception
          }
    }
    
}
