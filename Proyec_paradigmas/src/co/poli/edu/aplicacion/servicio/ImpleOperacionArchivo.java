package co.poli.edu.aplicacion.servicio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import co.poli.edu.aplicacion.modelo.Prestamo;

/**
 * 
 */
public class ImpleOperacionArchivo implements OperacionArchivo {

    /**
     * Default constructor
     */
    public ImpleOperacionArchivo() {
    }

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
	public Prestamo [ ] deserializar(String path, String name) {
		Prestamo[] a = null;

		try {
			FileInputStream fis = new FileInputStream(path + name);
			ObjectInputStream ois = new ObjectInputStream (fis);

			a = (Prestamo[]) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch(ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}

		return a;
	}


}