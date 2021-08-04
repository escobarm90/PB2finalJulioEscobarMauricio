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
		if(vacuna.getId()==2 && !pacientesSinVacunar.contains(paciente)) {
			throw new NoCovidVaccineException("Falta la primer dosis");
		}else if(paciente.getVacunas().size()<=2) {			
				paciente.recibirVacuna(vacuna);
				pacientesVacunados.add(paciente);
				pacientesSinVacunar.add(paciente);
			}
		}		
		
	
	
	
	
	public void vacunarPaciente(Paciente paciente, Vacuna vacuna) throws NoMoreVaccineException {
		if(paciente.getVacunas().size()<=2) {			
			paciente.recibirVacuna(vacuna);
			pacientesVacunados.add(paciente);
					
		}else throw new NoMoreVaccineException("NO puede darse mas vacunas");
	}
}
