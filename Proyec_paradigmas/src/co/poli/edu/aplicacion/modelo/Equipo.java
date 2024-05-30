package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;

/**
 * La clase Equipo representa un equipo con sus características y estado.
 */
public class Equipo implements Serializable {

    private String nombre;
    private String clase_equipo;
    private String descripcion_equipo;
    private String numero_serie;
    private int valor;
    private String estado_equipo;

    /**
     * Constructor que inicializa un nuevo objeto de la clase Equipo.
     * 
     * @param nombre             El nombre del equipo.
     * @param clase_equipo       La clase del equipo.
     * @param descripcion_equipo La descripción del equipo.
     * @param numero_serie       El número de serie del equipo.
     * @param valor              El valor del equipo.
     * @param estado_equipo      El estado del equipo (e.g., Disponible, Prestado).
     */
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

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del equipo.
     * 
     * @param nombre El nombre del equipo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la clase del equipo.
     * 
     * @return La clase del equipo.
     */
    public String getClase_equipo() {
        return clase_equipo;
    }

    /**
     * Establece la clase del equipo.
     * 
     * @param clase_equipo La clase del equipo.
     */
    public void setClase_equipo(String clase_equipo) {
        this.clase_equipo = clase_equipo;
    }

    /**
     * Obtiene la descripción del equipo.
     * 
     * @return La descripción del equipo.
     */
    public String getDescripcion_equipo() {
        return descripcion_equipo;
    }

    /**
     * Establece la descripción del equipo.
     * 
     * @param descripcion_equipo La descripción del equipo.
     */
    public void setDescripcion_equipo(String descripcion_equipo) {
        this.descripcion_equipo = descripcion_equipo;
    }

    /**
     * Obtiene el número de serie del equipo.
     * 
     * @return El número de serie del equipo.
     */
    public String getNumero_serie() {
        return numero_serie;
    }

    /**
     * Establece el número de serie del equipo.
     * 
     * @param numero_serie El número de serie del equipo.
     */
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    /**
     * Obtiene el valor del equipo.
     * 
     * @return El valor del equipo.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el valor del equipo.
     * 
     * @param valor El valor del equipo.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el estado del equipo.
     * 
     * @return El estado del equipo.
     */
    public String getEstado_equipo() {
        return estado_equipo;
    }

    /**
     * Establece el estado del equipo.
     * 
     * @param estado_equipo El estado del equipo.
     */
    public void setEstado_equipo(String estado_equipo) {
        this.estado_equipo = estado_equipo;
    }

    /**
     * Retorna una representación en cadena del objeto Equipo.
     * 
     * @return Una cadena que representa al equipo.
     */
    @Override
    public String toString() {
        return "Equipo \n Nombre=" + nombre + "\n clase_equipo=" + clase_equipo + "\n descripcion_equipo="
                + descripcion_equipo + "\n numero_serie=" + numero_serie + "\n valor=" + valor + "\n estado_equipo="
                + estado_equipo + "\n" + "\n";
    }
}