package ar.com.gugler.sgc.modelo;

public class Curso extends Asignatura  {

		private Integer Cupo;
	
	public void aniadirAlumno (Alumno estudiante) {
		if(admiteInscripciones()==true) {
			Alumnos.add(estudiante);
		}
		else {
			System.out.println("Lo sentimos, no hay mas cupos.");
		}
	}
	
	public void anularAlumno(Alumno estudiante) {
		Alumnos.remove (estudiante);
	}
		//no encontre como calcular el tama�o con el tipo de dato integer; cambio y fuera
	public boolean admiteInscripciones() {
		if ((Alumnos.size())<(this.Cupo)){
			return true;
		}
		else {
			return false;
		}
	}
	//constructor
	public Curso(Integer Cupo) {
		this.Cupo=Cupo;
	}
	
}
