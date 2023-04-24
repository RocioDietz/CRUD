package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;

public abstract class Persona {
	
	String NumeroDocumento;
	String Apellido, nombres;
	LocalDate fechaNacimiento;
	String domicilio, telefono, correo;
	
	//setter
	public void setNumeroDocumento(String h) {
		NumeroDocumento = h;
	}
	public String getNumeroDocumento() {
		return NumeroDocumento;
	}
	public void setApellido(String a) {
		Apellido=a;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setnombres(String nom) {
		nombres= nom;
	}
	public String getnombres() {
		return nombres;
	}
	public void setfechaNacimiento (LocalDate f){
		fechaNacimiento=f;
	}
	public LocalDate getfechaNacimiento () {
		return fechaNacimiento;
	}
	public void setdomicilio (String d) {
		domicilio = d;
	}
	public String getdomicilio () {
		return domicilio;
	}
	public void settelefono (String t) {
		telefono = t;
	}
	public String gettelefono () {
		return telefono;
	}
	public void setcorreo (String c){
		correo = c;
	}
	public String getcorreo() {
		return correo;
	}

	//metodos(operaciones)
	public abstract String mostrarInformacion();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + ((NumeroDocumento == null) ? 0 : NumeroDocumento.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (NumeroDocumento == null) {
			if (other.NumeroDocumento != null)
				return false;
		} else if (!NumeroDocumento.equals(other.NumeroDocumento))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (domicilio == null) {
			if (other.domicilio != null)
				return false;
		} else if (!domicilio.equals(other.domicilio))
			return false;
		if (fechaNacimiento != other.fechaNacimiento)
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [NumeroDocumento=" + NumeroDocumento + ", Apellido=" + Apellido + ", nombres=" + nombres
				+ ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", telefono=" + telefono
				+ ", correo=" + correo + ", mostrarInformacion()=" + mostrarInformacion() + "]";
	} 
	
}
