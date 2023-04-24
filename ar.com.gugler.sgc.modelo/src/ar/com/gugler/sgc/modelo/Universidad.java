package ar.com.gugler.sgc.modelo;

public class Universidad {
	static void mostrarDatos(Persona x) {
		System.out.println("Nombre: " + x.getnombres());
		System.out.println("Apellido: " + x.getApellido()); 
		System.out.println("DNI: " + x.getNumeroDocumento()); 
		System.out.println("Fecha de Nacimiento: " + x.getfechaNacimiento());
		System.out.println("Domicilio: " + x.domicilio); 
		System.out.println("Telefono: " + x.telefono); 
		System.out.println("E-mail: " + x.correo); 
		
	}
	public interface administrable {
		public boolean admiteInscripciones();
	}
}
