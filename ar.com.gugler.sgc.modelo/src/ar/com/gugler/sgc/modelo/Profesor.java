package ar.com.gugler.sgc.modelo;
import java.time.LocalDate;
public class Profesor extends Persona{

		String Cuil;
		LocalDate fechaIngreso;

	//setters
	public void setCuil(String index){
		Cuil = index;
	}
	public String getCuil() {
		return Cuil;
	}
	public void setfechaIngreso (LocalDate fechaIngreso){
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDate getfechaIngreso () {
		return fechaIngreso;
	}


   //constructor
   public Profesor(String Cuil, LocalDate fechaIngreso) {
	   this.Cuil = Cuil;
	   this.fechaIngreso=fechaIngreso;
   }

   //return
   public String mostrarInformacion() {
	   String nombre = super.getnombres();
		String apellido= super.getApellido();
		
		nombre.toUpperCase();
		apellido.toUpperCase();
		
		String aux="Nombre: " + nombres + "Apellido: " + Apellido + "CUIL: " + this.Cuil;
		
		
		return aux;			
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((Cuil == null) ? 0 : Cuil.hashCode());
	result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Profesor other = (Profesor) obj;
	if (Cuil == null) {
		if (other.Cuil != null)
			return false;
	} else if (!Cuil.equals(other.Cuil))
		return false;
	if (fechaIngreso == null) {
		if (other.fechaIngreso != null)
			return false;
	} else if (!fechaIngreso.equals(other.fechaIngreso))
		return false;
	return true;
}
}   