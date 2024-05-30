package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public  class  Prestamo implements Serializable{

    /**
     * Default constructor
     */
   

    /**
     * 
     */
    private Estudiante estudiante;

    /**
     * 
     */
    private Equipo equipo;

    /**
     * @param estado_equipo
     */
   

	public Prestamo(Estudiante estudiante, Equipo equipo) {
		super();
		this.estudiante = estudiante;
		this.equipo = equipo;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Prestamo [estudiante=" + estudiante + ", equipo=" + equipo + "]";
	}

    
}