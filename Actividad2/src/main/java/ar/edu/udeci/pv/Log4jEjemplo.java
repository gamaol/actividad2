package ar.edu.udeci.pv;

import org.apache.log4j.Logger;

public class Log4jEjemplo {
    // Instancia del logger
    private static final Logger logger = Logger.getLogger(Log4jEjemplo.class);

    public static void main(String[] args) {
        logger.debug("Este es un mensaje DEBUG");
        logger.info("La aplicación se inició correctamente");
        logger.warn("Esto es una advertencia");
        logger.error("Ocurrió un error");
        logger.fatal("Error FATAL, la app podría fallar");

        System.out.println("Mensaje mostrado por consola sin logger");
    }
}