package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Equipo  implements Serializable{

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
    private String clase_equipo;

    /**
     * 
     */
    private String descripcion_equipo;

    /**
     * 
     */
    private String numero_serie;

    /**
     * 
     */
    private int valor;
    
    
    /**
     * 
     */
    private String estado_equipo;

	public Equipo(String nombre, String clase_equipo, String descripcion_equipo, String numero_serie, int valor,
			String estado_equipo) {
		super();
		this.nombre = nombre;
		this.clase_equipo = clase_equipo;
		this.descripcion_equipo = descripcion_equipo;
		this.numero_serie = numero_serie;
		this.valor = valor;
		this.estado_equipo = estado_equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase_equipo() {
		return clase_equipo;
	}

	public void setClase_equipo(String clase_equipo) {
		this.clase_equipo = clase_equipo;
	}

	public String getDescripcion_equipo() {
		return descripcion_equipo;
	}

	public void setDescripcion_equipo(String descripcion_equipo) {
		this.descripcion_equipo = descripcion_equipo;
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getEstado_equipo() {
		return estado_equipo;
	}

	public void setEstado_equipo(String estado_equipo) {
		this.estado_equipo = estado_equipo;
	}

	@Override
	public String toString() {
		return "Equipo \n Nombre=" + nombre + "\n clase_equipo=" + clase_equipo + "\n descripcion_equipo="
				+ descripcion_equipo + "\n numero_serie=" + numero_serie + "\n valor=" + valor + "\n estado_equipo="
				+ estado_equipo + "\n"+"\n";
	}

    /**
     * @param nombre 
     * @param clase_eq 
     * @param descripcion 
     * @param numero_serie 
     * @param valor
     */
    

}