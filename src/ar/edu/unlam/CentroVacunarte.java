package ar.edu.unlam;

import java.util.Set;
import java.util.TreeSet;

public class CentroVacunarte {

	private String nombre;
	private Set<Paciente> pacientesVacunados;
	private Set<Paciente> pacientesSinVacunar;
	
	public CentroVacunarte(String nombre) {
		this.nombre = nombre;
		this.pacientesVacunados = new TreeSet<Paciente>();
		this.pacientesSinVacunar = new TreeSet<Paciente>();
	}
	
	public void vacunarPacienteCovid(Paciente paciente, Vacuna vacuna) throws NoCovidVaccineException {
		if(paciente.getVacunas().contains(vacuna.getId().equals("primera"))) {
			throw new NoCovidVaccineException("Falta la primer dosis");
		}else if(paciente.getVacunas().size()<=2) {			
				paciente.recibirVacuna(vacuna);
				pacientesVacunados.add(paciente);
				pacientesSinVacunar.add(paciente);
			}
		}		
		
	
	
	
	
	public Boolean vacunarPaciente(Paciente paciente, Vacuna vacuna) {
		if(paciente.getVacunas().size()<=2) {			
			paciente.recibirVacuna(vacuna);
			pacientesVacunados.add(paciente);
					
		}return true;
	}
}
