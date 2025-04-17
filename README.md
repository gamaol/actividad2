# Actividad2 - Proyecto Maven con Commons CLI y Log4j

## Descripción del Proyecto

Este proyecto es una aplicación de línea de comandos desarrollada en Java utilizando Maven como herramienta de construcción. Fue creado con fines educativos y tiene como objetivo demostrar el uso de dos librerías ampliamente utilizadas en Java:

- *Apache Commons CLI*: para procesar argumentos desde la línea de comandos.
- *Apache Log4j 2*: para registrar mensajes de log en la aplicación.

El artefacto se llama Actividad2, pertenece al groupId ar.edu.udeci.pv, y su versión es 1.0-SNAPSHOT.

---

## Funcionalidad

La aplicación permite recibir dos argumentos por línea de comandos:

- -i o --input: Archivo de entrada (obligatorio).
- -o o --output: Archivo de salida (opcional).

Ejemplo de ejecución:

```bash
java -jar target/Actividad2-1.0-SNAPSHOT.jar -i entrada.txt -o salida.txt
