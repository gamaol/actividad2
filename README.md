# Actividad2 - Proyecto Maven con Commons CLI y Log4j- Oldani Gabriel DNI 26274374


## Descripción del Proyecto

Este proyecto es una aplicación de línea de comandos desarrollada en Java utilizando Maven como herramienta de construcción. Fue creado con fines educativos y tiene como objetivo demostrar el uso de dos librerías ampliamente utilizadas en Java:

- *Apache Commons CLI*: para procesar argumentos desde la línea de comandos.
- *Apache Log4j 2*: para registrar mensajes de log en la aplicación.

El artefacto se llama Actividad2, pertenece al groupId ar.edu.udeci.pv, y su versión es 1.0-SNAPSHOT.

---

## Funcionalidad

La aplicación permite recibir dos argumentos por línea de comandos:

App.java
Utiliza commons-cli para procesar dos argumentos:

-n o --nombre: requerido

-e o --edad: opcional

Log4jEjemplo.java
Ejemplo de cómo utilizar log4j para registrar mensajes de distintos niveles:

DEBUG, INFO, WARN, ERROR, FATAL
Ejemplo de ejecución:

```bash
java -jar target/Actividad2-1.0-SNAPSHOT.jar -i entrada.txt -o salida.txt
