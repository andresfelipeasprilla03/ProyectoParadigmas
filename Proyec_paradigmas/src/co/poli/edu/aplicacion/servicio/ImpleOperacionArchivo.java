package co.poli.edu.aplicacion.servicio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import co.poli.edu.aplicacion.modelo.Prestamo;

/**
 * La clase ImpleOperacionArchivo implementa la interfaz OperacionArchivo y proporciona
 * las funcionalidades necesarias para serializar y deserializar objetos de tipo Prestamo.
 */
public class ImpleOperacionArchivo implements OperacionArchivo {

    /**
     * Constructor por defecto
     */
    public ImpleOperacionArchivo() {
    }

    /**
     * Serializa un arreglo de objetos Prestamo en un archivo.
     *
     * @param pr El arreglo de objetos Prestamo a serializar.
     * @param path La ruta donde se almacenará el archivo.
     * @param name El nombre del archivo.
     */
    @Override
    public void serializar(Prestamo[] pr, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pr);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Deserializa un archivo para obtener un arreglo de objetos Prestamo.
     *
     * @param path La ruta del archivo.
     * @param name El nombre del archivo.
     * @return Un arreglo de objetos Prestamo deserializado.
     */
    @Override
    public Prestamo[] deserializar(String path, String name) {
        Prestamo[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Prestamo[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return a;
    }
}
