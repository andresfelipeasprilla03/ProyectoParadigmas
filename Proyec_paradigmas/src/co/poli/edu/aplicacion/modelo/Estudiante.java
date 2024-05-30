package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Estudiante  implements Serializable{

    /**
     * Default constructor
     */
    
    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private String numero_identificacion;

    /**
     * 
     */
    private String programa_academico;

    /**
     * 
     */
    private String correo;

	public Estudiante(String nombre, String apellido, String numero_identificacion, String programa_academico,
			String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_identificacion = numero_identificacion;
		this.programa_academico = programa_academico;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	public String getPrograma_academico() {
		return programa_academico;
	}

	public void setPrograma_academico(String programa_academico) {
		this.programa_academico = programa_academico;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numero_identificacion="
				+ numero_identificacion + ", programa_academico=" + programa_academico + ", correo=" + correo + "]";
	}

    /**
     * @param nombre 
     * @param apellido 
     * @param id 
     * @param programa 
     * @param correo
     */
   

}