package co.poli.edu.aplicacion.servicio;

import java.util.*;

import co.poli.edu.aplicacion.modelo.*;

/**
 * 
 */
public class ImpleOperacion implements Operacion {

    /**
     * Default constructor
     */
   

    /**
     * 
     */
    public Prestamo [ ] arreglo= new Prestamo[3];
    public Equipo []arreglo_equi= new Equipo[3];
    public Estudiante estudiante= new Estudiante(null, null, null, null, null);

    /**
     * @param pr 
     * @return
     */
    public String create(Prestamo pr) {
    	
    	for (int i = 0; i < arreglo.length; i++) {
	    		
	    		if(arreglo[i]==null) {
	    			arreglo[i]=pr;
	    			return "Se ha realizado el prestamo exitosamente";
	    		}
	    		
	    	if(arreglo.length>3) {
	    		Prestamo[] arr= new Prestamo[arreglo.length*2];
	    		for (int j = 0; j < arr.length; j++) {
	    			arr[j]=arreglo[j];
				}
	    		arreglo=arr;
	    	
	    		for (int j = 0; j < arreglo.length; j++) {
					if(arreglo==null) {
						arreglo[j]=pr;
		    			return "Se ha realizado el prestamo exitosamente";
	 
					}
				}
	    	}
	    	
	    	
	    		
	    	}
	    	
	    	
		return "No Se ha realizado el prestamo exitosamente";
					
	    }


	@Override
	public Prestamo[] read(String id) {
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
				return arreglo;
			}
		}
    	
    	return null;
    }

	@Override
	public String update(String id) {
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
					arreglo[i].getEquipo().setEstado_equipo("Disponible");
					return"Se ha devuelto el equipo exitosamente";
				
			}
		}
		return"No se ha devuelto el equipo";
    }

	@Override
	public Prestamo delete(String id) {
		
		
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i].getEstudiante().getNumero_identificacion().equals(id)) {
				arreglo[i].getEquipo().setEstado_equipo("Disponible");
				return arreglo[i];
			}
		}
		return null;	
	}

	public Prestamo[] getArreglo() {
		return arreglo;
	}


	@Override
	public String create_equi(Equipo equi) {

    	for (int i = 0; i < arreglo_equi.length; i++) {
	    		
	    		if(arreglo_equi[i]==null) {
	    			arreglo_equi[i]=equi;
	    			return "Se ha realizado el Registro del Equipo";
	    		}
	    		
	    	if(arreglo.length>3) {
	    		Equipo[] arr= new Equipo[arreglo_equi.length*2];
	    		for (int j = 0; j < arr.length; j++) {
	    			arr[j]=arreglo_equi[j];
				}
	    		arreglo_equi=arr;
	    	
	    		for (int j = 0; j < arreglo_equi.length; j++) {
					if(arreglo_equi==null) {
						arreglo_equi[j]=equi;
		    			return "Se ha realizado el Registro del Equipo";
	 
					}
				}
	    	}
	    	
	    	
	    		
	    	}
	    	
	    	
		return "No se podido realizado el Registro del Equipo";
					
	    }
	public Equipo[] getArregloequipo() {
		return arreglo_equi;
	}


	@Override
	public String create_usua(Estudiante estu) {
		estudiante=estu;
		return "Registro de estudiante exitoso";
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public Estudiante delete_estu(String id) {
		
		if(estudiante.getNumero_identificacion().equals(id)) {
			estudiante=null;
			return estudiante;
		}
		return null;
	}



	@Override
	public Equipo delete_equi(String num_serie) {
		for (int i = 0; i < arreglo_equi.length; i++) {
			if(arreglo_equi[i].getNumero_serie().equals(num_serie)) {
				arreglo_equi[i]=null;
				return arreglo_equi[i];
			}
		}
		return null;
	}
}