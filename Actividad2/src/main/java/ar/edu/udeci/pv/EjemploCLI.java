package ar.edu.udeci.pv;
import org.apache.commons.cli.*;

public class EjemploCLI {
    public static void main(String[] args) {
        // 1. Crear las opciones disponibles
        Options options = new Options();

        Option nombre = new Option("n", "nombre", true, "Tu nombre");
        nombre.setRequired(true); // esta opción es obligatoria
        options.addOption(nombre);

        Option edad = new Option("e", "edad", true, "Tu edad");
        edad.setRequired(false); // esta opción es opcional
        options.addOption(edad);

        // 2. Crear el parser de línea de comandos
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter(); // para mostrar ayuda
        CommandLine cmd;

        try {
            // 3. Parsear los argumentos
            cmd = parser.parse(options, args);

            // 4. Obtener los valores
            String nombreValor = cmd.getOptionValue("nombre");
            String edadValor = cmd.getOptionValue("edad");

            // 5. Usar los valores
            System.out.println("Hola, " + nombreValor + "!");
            if (edadValor != null) {
                System.out.println("Tenés " + edadValor + " años.");
            }

        } catch (ParseException e) {
            // Si hay un error en los argumentos, mostrar ayuda
            System.out.println("Error al procesar los argumentos: " + e.getMessage());
            formatter.printHelp("java -jar EjemploCLI.jar", options);
            System.exit(1);
        }
    }
}