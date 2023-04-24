package ar.com.gugler.sgc.modelo;

import java.util.List;
import java.util.ArrayList;

public abstract class Asignatura {

		Integer codigo;
	    String Nombre;
	    List<Alumno> Alumnos = new ArrayList<Alumno>();
	    Profesor profesores;
	    
		public void setcodigo (Integer codigo) {
	    	this.codigo=codigo;
	    }
	public Integer getcodigo () {
		return codigo;
	}
    public void setNombre (String Nombre) {
    	this.Nombre =Nombre;
    }
    public String getNombre () {
    	return Nombre;
    }
    public void setAlumnos (List Alumnos) {
    	this.Alumnos=Alumnos;
    }
    public List getListAlumnos () {
    	return Alumnos;
    }
    public void setprofesores (Profesor profesores) {
    	this.profesores= profesores;
    }
    public Profesor getprofesores () {
    	return profesores;
    }
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	}
    



 
 

 