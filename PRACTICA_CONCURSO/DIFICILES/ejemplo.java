package PRACTICA_CONCURSO.DIFICILES;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
public class ejemplo {

    public static int diasEntreFechas(String f1, String f2) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); 
        // Asegura que las fechas sean estrictamente válidas

        Date fecha1 = formato.parse(f1);
        Date fecha2 = formato.parse(f2);

        long milisDiff = Math.abs(fecha1.getTime() - fecha2.getTime());
        return (int) (milisDiff / (1000 * 60 * 60 * 24));
    }

    public static void main(String[] args) {
        try {
            String n=String.format(JOptionPane.showInputDialog("ingrese la primera fecha dd/MM/yyyy"));
            String m=String.format(JOptionPane.showInputDialog("ingrese la segunda fecha dd/MM/yyyy"));

            int dias = diasEntreFechas(n, m);
            JOptionPane.showMessageDialog(null,"Diferencia en días: " + dias);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Fecha inválida");
                      
        }
    }

    
}

