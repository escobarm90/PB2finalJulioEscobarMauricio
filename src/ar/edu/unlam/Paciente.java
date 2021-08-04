package ar.edu.unlam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Paciente implements Comparable<Paciente> {

	private String nombre;
	private String apellido;
	private Integer dni;
	private List<Vacuna> vacunas;
	private Boolean tuvoRubeola = false;
	private Boolean tuvoHepatitis = false;
	
	public Paciente(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.vacunas = new ArrayList<Vacuna>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getDni() {
		return dni;
	}
	
	public void recibirVacuna(Vacuna vacuna) {		
		vacunas.add(vacuna);
	}
	
	public List<Vacuna> getVacunas() {
		return this.vacunas;
	}
	
	public Boolean tuvoRubeola() {
		if (this.tuvoRubeola = true) {
			tuvoRubeola = true;	
		}return tuvoRubeola;
	}
	
	public Boolean tuvoHepatitis() {
		if (this.tuvoHepatitis = true) {
			tuvoHepatitis = true;	
		}return tuvoHepatitis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}




	@Override
	public int compareTo(Paciente p) {
		if (this.getDni().compareTo(p.getDni()) != 0) {
			return this.getDni().compareTo(p.getDni());
		}
		return this.getNombre().compareTo(p.getNombre());
	}


	
	
}
