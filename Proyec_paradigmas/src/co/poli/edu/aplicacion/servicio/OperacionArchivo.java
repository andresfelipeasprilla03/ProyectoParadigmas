package co.poli.edu.aplicacion.servicio;

import java.util.*;

import co.poli.edu.aplicacion.modelo.Prestamo;

/**
 * 
 */
public interface OperacionArchivo {

    /**
     * @param pr 
     * @param path 
     * @param name
     */
    public void serializar(Prestamo []pr, String path, String name);

    /**
     * @param path 
     * @param name 
     * @return
     */
    public Prestamo [ ] deserializar(String path, String name);


}