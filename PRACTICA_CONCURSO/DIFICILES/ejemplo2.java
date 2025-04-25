package PRACTICA_CONCURSO.DIFICILES;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejemplo2 {


        
        public static int diasEntreFechas(String fecha1, String fecha2) throws ParseException {
            // Crear un formateador de fecha
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false); 
            // No permitir fechas inválidas como 32/01/2020
    
            // Convertir las cadenas en objetos Date
            Date date1 = formato.parse(fecha1);
            Date date2 = formato.parse(fecha2);
    
            // Calcular la diferencia en milisegundos
            long diferenciaMs = Math.abs(date1.getTime() - date2.getTime());
    
            // Convertir de milisegundos a días
            long diferenciaDias = diferenciaMs / (1000 * 60 * 60 * 24);
    
            return (int) diferenciaDias;
        }
    
        // Para probar la función
        public static void main(String[] args) {
            try {
                int dias = diasEntreFechas("24/04/2025", "01/05/2025");
                System.out.println("Días de diferencia: " + dias);
            } catch (ParseException e) {
                System.out.println("¡Formato de fecha incorrecto!");
            }
        }
    
    
}
