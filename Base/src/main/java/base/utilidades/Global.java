package base.utilidades;

import javax.persistence.EntityManagerFactory;

/**
 * Clase contenedora de las constantes
 *
 * @author Omar Paché
 */
public class Global {

    // Constante inyectada desde el archivo de propiedades
    public static String ambiente;
    public static EntityManagerFactory emf = null;
    public static String dataBase = null;
    public static String dataBaseUrl = null;
    public static int dataBasePort;
    public static String dataBaseUser = "root";
    public static String dataBasePassword = "toor";
}
