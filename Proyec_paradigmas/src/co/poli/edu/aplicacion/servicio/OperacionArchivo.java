package co.poli.edu.aplicacion.servicio;

import java.util.*;

import co.poli.edu.aplicacion.modelo.Prestamo;

/**
 * La interfaz OperacionArchivo define los métodos necesarios para la serialización y deserialización de objetos
 * de tipo Prestamo.
 */
public interface OperacionArchivo {

    /**
     * Serializa un arreglo de objetos Prestamo y lo guarda en el archivo especificado.
     *
     * @param pr   El arreglo de objetos Prestamo a ser serializado.
     * @param path La ruta del archivo donde se guardará el objeto serializado.
     * @param name El nombre del archivo donde se guardará el objeto serializado.
     */
    public void serializar(Prestamo[] pr, String path, String name);

    /**
     * Deserializa un archivo y retorna un arreglo de objetos Prestamo.
     *
     * @param path La ruta del archivo desde donde se deserializará el objeto.
     * @param name El nombre del archivo desde donde se deserializará el objeto.
     * @return Un arreglo de objetos Prestamo deserializados.
     */
    public Prestamo[] deserializar(String path, String name);
}
