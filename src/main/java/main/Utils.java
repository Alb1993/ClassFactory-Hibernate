package main;

/**
 * @version 1.0
 * @author FPShare
 * 
 * Clase que contiene funciones utiles para el correcto funcionamiento del
 * aplicativo
 */
public class Utils {

    /**
     * Función para la conversión de Fechas tipo SQL a Util.Date de Java
     * 
     * @param fecha
     * @return 
     */
    public static java.sql.Date convertirSqlDate(java.util.Date fecha) {
        java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
        return fechaSql;
    }
}