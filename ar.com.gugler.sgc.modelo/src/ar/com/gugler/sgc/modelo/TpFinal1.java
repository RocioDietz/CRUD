package ar.com.gugler.sgc.modelo;
import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
public class TpFinal1 {

	public TpFinal1() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalDate fechaNacimiento = null;
     LocalDate fechaIngreso = null;
     
     fechaNacimiento= LocalDate.of(1997, 06, 13);
     Alumno x = new Alumno("2");
     x.setApellido("Dietz");
     x.setnombres("Rocio");
     x.setfechaNacimiento(fechaNacimiento);
     x.setdomicilio("A. Salto");
     x.setcorreo("rodietz61@...");
     x.setNumeroDocumento("10000000");
     x.settelefono("3434556987");
	 x.setlegajo("2");
	 
	 fechaNacimiento = LocalDate.of(1975,11,07);
	 fechaIngreso= LocalDate.of(2018, 02, 19);
	 
	 Profesor x1 = new Profesor("353",fechaIngreso );
	 x1.setApellido("Beltramino");
	 x1.setnombres("Pepe");
	 x1.setdomicilio("Santa fe");
	 x1.settelefono("345005066");
	 x1.setCuil("111110");
	 x1.setfechaNacimiento(fechaNacimiento);
	 x1.setfechaIngreso(fechaIngreso);
	 x1.setcorreo("pepebeltra@...com");
	 x1.setNumeroDocumento("11908111");
	 
	 Universidad uader = new Universidad();
		
		uader.mostrarDatos(x);
		System.out.println();
		Universidad.mostrarDatos(x1);		
		System.out.println();
		
   ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
   listaAlumnos.add(x);
   Curso curso =  new Curso(20);
   curso.setNombre("Programacion en Java");
	curso.setprofesores(x1);
	curso.aniadirAlumno(x);
	//curso.setCupo(23);
	
	 
	}
	
 
}
