package ar.edu.unlam;

import java.util.Comparator;

import ar.edu.unlam.example.Auto;

public class Paciente implements Comparator<Paciente> {

	private String nombre;
	private String apellido;
	private Integer dni;
	
	public Paciente(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
	public int compare(Paciente p1, Paciente p2) {
		if (p1.getDni().compareTo(p2.getDni()) != 0) {
			return p1.getDni().compareTo(p2.getDni());
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}


	
	
}
