package co.poli.edu.aplicacion.servicio;

import java.util.*;
import co.poli.edu.aplicacion.modelo.*;

/**
 * La clase ImpleOperacion implementa la interfaz Operacion y proporciona las funcionalidades básicas
 * para gestionar préstamos, equipos y estudiantes.
 */
public class ImpleOperacion implements Operacion {

    public Prestamo[] arreglo = new Prestamo[3];
    public Equipo[] arreglo_equi = new Equipo[3];
    public Estudiante estudiante = new Estudiante(null, null, null, null, null);

    /**
     * Crea un nuevo préstamo.
     * 
     * @param pr El préstamo a crear.
     * @return Un mensaje indicando si el préstamo se realizó exitosamente.
     */
    public String create(Prestamo pr) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = pr;
                return "Se ha realizado el préstamo exitosamente";
            }

            if (arreglo.length > 3) {
                Prestamo[] arr = new Prestamo[arreglo.length * 2];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arreglo[j];
                }
                arreglo = arr;

                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[j] == null) {
                        arreglo[j] = pr;
                        return "Se ha realizado el préstamo exitosamente";
                    }
                }
            }
        }
        return "No se ha realizado el préstamo exitosamente";
    }

    /**
     * Lee los préstamos de un estudiante por su identificación.
     * 
     * @param id La identificación del estudiante.
     * @return Un arreglo de préstamos del estudiante.
     */
    @Override
    public Prestamo[] read(String id) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
                return arreglo;
            }
        }
        return null;
    }

    /**
     * Actualiza el estado de un préstamo, devolviendo el equipo.
     * 
     * @param id La identificación del estudiante.
     * @return Un mensaje indicando si la devolución fue exitosa.
     */
    @Override
    public String update(String id) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
                arreglo[i].getEquipo().setEstado_equipo("Disponible");
                return "Se ha devuelto el equipo exitosamente";
            }
        }
        return "No se ha devuelto el equipo";
    }

    /**
     * Elimina un préstamo por la identificación del estudiante.
     * 
     * @param id La identificación del estudiante.
     * @return El préstamo eliminado.
     */
    @Override
    public Prestamo delete(String id) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
                arreglo[i].getEquipo().setEstado_equipo("Disponible");
                return arreglo[i];
            }
        }
        return null;
    }

    public Prestamo[] getArreglo() {
        return arreglo;
    }

    /**
     * Crea un nuevo equipo.
     * 
     * @param equi El equipo a crear.
     * @return Un mensaje indicando si el registro del equipo fue exitoso.
     */
    @Override
    public String create_equi(Equipo equi) {
        for (int i = 0; i < arreglo_equi.length; i++) {
            if (arreglo_equi[i] == null) {
                arreglo_equi[i] = equi;
                return "Se ha realizado el Registro del Equipo";
            }

            if (arreglo.length > 3) {
                Equipo[] arr = new Equipo[arreglo_equi.length * 2];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arreglo_equi[j];
                }
                arreglo_equi = arr;

                for (int j = 0; j < arreglo_equi.length; j++) {
                    if (arreglo_equi[j] == null) {
                        arreglo_equi[j] = equi;
                        return "Se ha realizado el Registro del Equipo";
                    }
                }
            }
        }
        return "No se ha podido realizar el Registro del Equipo";
    }

    public Equipo[] getArregloequipo() {
        return arreglo_equi;
    }

    /**
     * Registra un nuevo estudiante.
     * 
     * @param estu El estudiante a registrar.
     * @return Un mensaje indicando si el registro del estudiante fue exitoso.
     */
    @Override
    public String create_usua(Estudiante estu) {
        estudiante = estu;
        return "Registro de estudiante exitoso";
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Elimina un estudiante por su identificación.
     * 
     * @param id La identificación del estudiante.
     * @return El estudiante eliminado.
     */
    public Estudiante delete_estu(String id) {
        if (estudiante.getNumero_identificacion().equals(id)) {
            estudiante = null;
            return estudiante;
        }
        return null;
    }

    /**
     * Elimina un equipo por su número de serie.
     * 
     * @param num_serie El número de serie del equipo.
     * @return El equipo eliminado.
     */
    @Override
    public Equipo delete_equi(String num_serie) {
        for (int i = 0; i < arreglo_equi.length; i++) {
            if (arreglo_equi[i].getNumero_serie().equals(num_serie)) {
                arreglo_equi[i] = null;
                return arreglo_equi[i];
            }
        }
        return null;
    }
}
