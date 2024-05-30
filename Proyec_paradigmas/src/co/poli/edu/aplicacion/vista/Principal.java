package co.poli.edu.aplicacion.vista;

import java.util.*;
import co.poli.edu.aplicacion.servicio.*;
import co.poli.edu.aplicacion.modelo.*;

/**
 * 
 */
public class Principal {

    /**
     * Default constructor
     */
    public Principal() {
    }

    /**
     * @param args
     */
    public static void main(String [ ] args) {
    	
    Scanner tc= new Scanner (System.in);
    ImpleOperacion obj= new ImpleOperacion();
    ImpleOperacionArchivo ioa= new ImpleOperacionArchivo();
    Calendar fecha= Calendar.getInstance();
    
    System.out.println("Seleccione una accion");
    System.out.println("1.Crear\n2.Pedir Prestamo de equipo\n3.Devolver equipo \n4.Consultar Historial de prestamo\n5.Eliminar\n6.Guardar informacion de prestamo  en la nube \n7.Sacar informacion de la nube");
    int menu= tc.nextInt();
    tc.nextLine();
    
    do {
    	
    	switch(menu){
    		
    	case 1:
    		System.out.println("Que deseas crear:\n1.Registro de un equipo\n2.Registtro de usuario");
    		int num=tc.nextInt();
    		tc.nextLine();
    		
    		Equipo equi= new Equipo(null, null, null, null,0, null);
    		
    		if(num==1) {
    			
    			System.out.println("Nombre del equipo:");
    			String nom_eq= tc.nextLine();
    			System.out.println("Clase de equipo:");
    			String clase=tc.nextLine();
    			System.out.println("Descripcion del equipo:");
    			String descrip= tc.nextLine();
    			System.out.println("Numero de serie del equipo");
    			String num_ser=tc.nextLine();
    			System.out.println("Valor del equipo");
    			int valor=Integer.parseInt(tc.nextLine());
    			
    			 equi= new Equipo(nom_eq, clase, descrip, num_ser, valor, "Disponible");
    			System.out.println(obj.create_equi(equi));

    		}
    		if(num==2) {
    			System.out.println("Nombres de Usuario:");
    			String nom= tc.nextLine();
    			System.out.println("Apellidos de Usuario:");
    			String ape= tc.nextLine();
    			System.out.println("Escriba su numero de identificacion:");
    			String id= tc.nextLine();
    			System.out.println("Escriba carrera la cual cursa:");
    			String crr= tc.nextLine();
    			System.out.println("Escriba correo electronico");
    			String elec= tc.nextLine();
    			Estudiante estu= new Estudiante(nom, ape, id, crr, elec);
    			System.out.println( obj.create_usua(estu));
    			
    		}
    		if(num<0 && num>2) {
    			System.out.println("Opcion invalida");
    		}
    		
    	 break;
    	 
    	case 2:
    		int contador=0;
    		System.out.println("Equipos para Prestamo:");
    		Equipo[] eq= obj.getArregloequipo();
    		for (int i = 0; i < eq.length; i++) {
    			contador++;
				System.out.println(contador+"."+eq[i]);
			}
    		System.out.println("Seleccione el numero del equipo el cual este interasado");
    		int num_case_2=tc.nextInt();
    		tc.nextLine();
    		
    		if(num_case_2==1) {  
    			if(eq[0].getEstado_equipo()== "Disponible") {
            		eq[0].setEstado_equipo("Prestado");
    			Prestamo pr= new Prestamo(obj.getEstudiante(), eq[0]);
    			System.out.println( obj.create(pr));
    			System.out.println("Fecha de prestamo");
    			String fecha_prestamo= fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE);
    			System.out.println(fecha_prestamo);
        		}
    			else {
    	    		System.out.println("EL objeto ya esta prestado no esta disponible en este momento");
    			}
    		}
    		if(num_case_2==2) {
    			if(eq[1].getEstado_equipo()== "Disponible") {
    			eq[1].setEstado_equipo("Prestado");
    		
    			Prestamo pr= new Prestamo(obj.getEstudiante(), eq[1]);
    			System.out.println( obj.create(pr));
    			System.out.println("Fecha de prestamo");
    			String fecha_prestamo= fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE);
    			System.out.println(fecha_prestamo);
    			}
    			else {
    	    		System.out.println("EL objeto ya esta prestado no esta disponible en este momento");
    			}
    		}
    		if(num_case_2==3) {
    			if(eq[2].getEstado_equipo()== "Disponible") {
    			eq[2].setEstado_equipo("Prestado");
    		
    			Prestamo pr= new Prestamo(obj.getEstudiante(), eq[2]);
    			System.out.println( obj.create(pr));
    			System.out.println("Fecha de prestamo");
    			String fecha_prestamo= fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE);
    			System.out.println(fecha_prestamo);
    			}
    			else {
    	    		System.out.println("EL objeto ya esta prestado no esta disponible en este momento");
    			}
    		}
    		if(num_case_2<0 && num_case_2>3) {
    			System.out.println("Opcion invalida");
    		}
    	break;
    	
    	case 3:
    		System.out.println("Escriba su numero de identificacion");
    		String id=tc.nextLine();
    		System.out.println(obj.update(id));
			String fecha_prestamo1= fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE);
			System.out.println("Devuelto a las: "+fecha_prestamo1);
    		
    		
    	break;
    	
    	case 4:
    		System.out.println("Escriba su numero de identificacion");
    		String id_1=tc.nextLine();
    		Prestamo[]arr=obj.read(id_1);
    		for (int i = 0; i < arr.length; i++) {
    			if(arr[i]!=null) {
    				String fecha_prestamo= fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE);
    				System.out.println(arr[i]+"a las "+fecha_prestamo);
    			}
			}
    		
        break;
    	case 5:
    		System.out.println("Eliminar:\n1.Prestamo\n2.usuario\n3.Equipo");
    		int num_case_5=Integer.parseInt(tc.nextLine());

    		
    		if(num_case_5==1) {
    			System.out.println("Digite su numero de identificacion");
    			String id_2= tc.nextLine();
    			obj.delete(id_2);
    			System.out.println("El prestamo se elimino");
    			
    		}
    		if(num_case_5==2) {
    			System.out.println("Digite su numero de identificacion");
    			String id_2= tc.nextLine();
    			obj.delete_estu(id_2);
    			System.out.println("El usuario fue eliminado");

    		}		
    		
    		if(num_case_5==3) {
    			System.out.println("Digite su numero de serie");
    			String id_2= tc.nextLine();
    			obj.delete_equi(id_2);
    			System.out.println("El registro del equipo fue eliminado");

    		}
    	break;
    	
    	case 6:
    		ioa.serializar(obj.getArreglo(),"", "Prestamo_bin");
			System.out.println("La informacion se guardo correctamente");

			break;
			
		case 7:
		
			Prestamo[] nose= ioa.deserializar("", "Prestamo_bin");
			for (int i = 0; i < nose.length; i++) {
				System.out.println(nose[i]);
			}
    		break;
    	
    	}
    	
    	
    	System.out.println("Seleccione una accion");
        System.out.println("1.Crear\n2.Pedir Prestamo de equipo\n3.Devolver equipo \n4.Consultar Historial de prestamo\n5.Eliminar\n6.Guardar informacion de prestamo en la nube \n7.Sacar informacion de la nube");
        menu= tc.nextInt();
     tc.nextLine();
    	
    }while(menu !=8);
    
    
    }

}