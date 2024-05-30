package co.poli.edu.aplicacion.servicio;

import java.util.*;

import co.poli.edu.aplicacion.modelo.*;

/**
 * 
 */
public interface Operacion {

    /**
     * @param pr 
     * @return
     */
    public String create(Prestamo pr);

    /**
     * @param id 
     * @return
     */
    public Prestamo[] read(String id);

    /**
     * @param id 
     * @return
     */
    public String update(String id);

    /**
     * @param id 
     * @return
     */
    public Prestamo delete(String id);
    
    
    public String create_equi(Equipo equi);
    
    public String create_usua(Estudiante estu);
    
    public Estudiante delete_estu(String id);
    
    public Equipo delete_equi(String num_serie);

    	
    

}