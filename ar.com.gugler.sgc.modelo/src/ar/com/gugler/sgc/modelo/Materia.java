package ar.com.gugler.sgc.modelo;

public class Materia {

		Integer anio;

	
	public void setanio (Integer anio) {
		this.anio=anio;
	}
	public Integer getanio() {
		return anio;
	}
	
	public Materia (Integer anio) {
		this.anio=anio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
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
		Materia other = (Materia) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		return true;
	}
}
