package ar.com.gugler.sgc.modelo;

public class Alumno extends Persona {

	public Alumno(String legajo) {
		super();
		this.legajo = legajo;
	}

	String legajo;

	public void setlegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getlegajo() {
		return getlegajo();
	}

	public String mostrarInformacion() {
		String aux = "Nombre: " + super.getnombres() + "Apellido: " + super.getApellido() + "DNI: "
				+ super.getNumeroDocumento();
		;
		return aux;
	}

	public static void remove(Alumno estudiante) {
		// TODO Auto-generated method stub
	}
}
