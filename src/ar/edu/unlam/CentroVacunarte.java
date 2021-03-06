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
		
	public Set<Paciente> getPacientesVacunados(){
		return this.pacientesVacunados;
	}
	
	
	
	public void vacunarPacienteHepatitis(Paciente paciente, Vacuna vacuna) throws TuvoHepatitisException {
		if(paciente.getVacunas().size()<=2 && paciente.tuvoHepatitis().equals(false)) {			
			paciente.recibirVacuna(vacuna);
			pacientesVacunados.add(paciente);					
		}else throw new TuvoHepatitisException("TUVO HEPATITIS");
	}
	
	public void vacunarPacienteRubeola(Paciente paciente, Vacuna vacuna) throws TuvoRubeolaException {
		if(paciente.getVacunas().size()<=2 && paciente.tuvoRubeola().equals(false)) {			
			paciente.recibirVacuna(vacuna);
			pacientesVacunados.add(paciente);					
		}else throw new TuvoRubeolaException("TUVO Rubeola");
	}
}
	



