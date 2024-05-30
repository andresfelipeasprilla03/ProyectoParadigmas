package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;

/**
 * La clase Estudiante representa a un estudiante con sus detalles personales y académicos.
 */
public class Estudiante implements Serializable {

    private String nombre;
    private String apellido;
    private String numero_identificacion;
    private String programa_academico;
    private String correo;

    /**
     * Constructor que inicializa un nuevo objeto de la clase Estudiante.
     * 
     * @param nombre              El nombre del estudiante.
     * @param apellido            El apellido del estudiante.
     * @param numero_identificacion El número de identificación del estudiante.
     * @param programa_academico  El programa académico del estudiante.
     * @param correo              El correo electrónico del estudiante.
     */
    public Estudiante(String nombre, String apellido, String numero_identificacion, String programa_academico,
            String correo) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_identificacion = numero_identificacion;
        this.programa_academico = programa_academico;
        this.correo = correo;
    }

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * 
     * @param nombre El nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del estudiante.
     * 
     * @return El apellido del estudiante.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del estudiante.
     * 
     * @param apellido El apellido del estudiante.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de identificación del estudiante.
     * 
     * @return El número de identificación del estudiante.
     */
    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    /**
     * Establece el número de identificación del estudiante.
     * 
     * @param numero_identificacion El número de identificación del estudiante.
     */
    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    /**
     * Obtiene el programa académico del estudiante.
     * 
     * @return El programa académico del estudiante.
     */
    public String getPrograma_academico() {
        return programa_academico;
    }

    /**
     * Establece el programa académico del estudiante.
     * 
     * @param programa_academico El programa académico del estudiante.
     */
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }

    /**
     * Obtiene el correo electrónico del estudiante.
     * 
     * @return El correo electrónico del estudiante.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del estudiante.
     * 
     * @param correo El correo electrónico del estudiante.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna una representación en cadena del objeto Estudiante.
     * 
     * @return Una cadena que representa al estudiante.
     */
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numero_identificacion="
                + numero_identificacion + ", programa_academico=" + programa_academico + ", correo=" + correo + "]";
    }
}