package co.poli.edu.aplicacion.modelo;

import java.io.Serializable;

/**
 * La clase Prestamo representa un préstamo de un equipo a un estudiante.
 */
public class Prestamo implements Serializable {

    private Estudiante estudiante;
    private Equipo equipo;

    /**
     * Constructor que inicializa un nuevo objeto de la clase Prestamo.
     * 
     * @param estudiante El estudiante que realiza el préstamo.
     * @param equipo     El equipo prestado.
     */
    public Prestamo(Estudiante estudiante, Equipo equipo) {
        super();
        this.estudiante = estudiante;
        this.equipo = equipo;
    }

    /**
     * Obtiene el estudiante que realiza el préstamo.
     * 
     * @return El estudiante que realiza el préstamo.
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Establece el estudiante que realiza el préstamo.
     * 
     * @param estudiante El estudiante que realiza el préstamo.
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Obtiene el equipo prestado.
     * 
     * @return El equipo prestado.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo prestado.
     * 
     * @param equipo El equipo prestado.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Retorna una representación en cadena del objeto Prestamo.
     * 
     * @return Una cadena que representa el préstamo.
     */
    @Override
    public String toString() {
        return "Prestamo [estudiante=" + estudiante + ", equipo=" + equipo + "]";
    }
}
