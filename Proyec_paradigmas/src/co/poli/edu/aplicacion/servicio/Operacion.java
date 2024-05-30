package co.poli.edu.aplicacion.servicio;

import java.util.*;

import co.poli.edu.aplicacion.modelo.*;

/**
 * La interfaz Operacion define los métodos necesarios para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * sobre los objetos Prestamo, Equipo y Estudiante.
 */
public interface Operacion {

    /**
     * Crea un nuevo registro de préstamo.
     *
     * @param pr El objeto Prestamo a ser creado.
     * @return Una cadena que indica si la operación fue exitosa.
     */
    public String create(Prestamo pr);

    /**
     * Lee los registros de préstamos asociados a un ID de estudiante.
     *
     * @param id El ID del estudiante cuyos préstamos se desean leer.
     * @return Un arreglo de objetos Prestamo asociados al ID.
     */
    public Prestamo[] read(String id);

    /**
     * Actualiza el estado de un equipo asociado a un préstamo, basado en el ID del estudiante.
     *
     * @param id El ID del estudiante cuyo préstamo se desea actualizar.
     * @return Una cadena que indica si la operación fue exitosa.
     */
    public String update(String id);

    /**
     * Elimina un registro de préstamo basado en el ID del estudiante.
     *
     * @param id El ID del estudiante cuyo préstamo se desea eliminar.
     * @return El objeto Prestamo eliminado.
     */
    public Prestamo delete(String id);

    /**
     * Crea un nuevo registro de equipo.
     *
     * @param equi El objeto Equipo a ser creado.
     * @return Una cadena que indica si la operación fue exitosa.
     */
    public String create_equi(Equipo equi);

    /**
     * Crea un nuevo registro de estudiante.
     *
     * @param estu El objeto Estudiante a ser creado.
     * @return Una cadena que indica si la operación fue exitosa.
     */
    public String create_usua(Estudiante estu);

    /**
     * Elimina un registro de estudiante basado en el ID del estudiante.
     *
     * @param id El ID del estudiante que se desea eliminar.
     * @return El objeto Estudiante eliminado.
     */
    public Estudiante delete_estu(String id);

    /**
     * Elimina un registro de equipo basado en el número de serie del equipo.
     *
     * @param num_serie El número de serie del equipo que se desea eliminar.
     * @return El objeto Equipo eliminado.
     */
    public Equipo delete_equi(String num_serie);
}
