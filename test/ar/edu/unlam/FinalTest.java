package ar.edu.unlam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FinalTest {
	
	@Test
	public void queLosPacientesNoCuentenConNingunaVacunaAlMomentoDeSuCreacion() {
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);
		
		assertEquals(nuevo.getVacunas().size(),0,0.1);
	}
	
	@Test (expected = NoCovidVaccineException.class)
	public void queSeConsidereVacunadoContraElCovidSoloCuandoTengaLasDosDosis() throws NoCovidVaccineException {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);
		Vacuna covid1 = new Covid19PrimerDosis();
		Vacuna covid2 = new Covid19SegundaDosis();		
		centro.vacunarPacienteCovid(nuevo, covid2);		
	}
	
	@Test
	public void queUnPacienteNoSePuedaVacunarConMasDeDosVacunasDistintas() throws NoCovidVaccineException {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);
		Vacuna covid1 = new Covid19PrimerDosis();
		Vacuna covid2 = new Covid19SegundaDosis();	
		Vacuna rubeola = new Rubeola();
		centro.vacunarPacienteCovid(nuevo, covid1);	
		centro.vacunarPacienteCovid(nuevo, covid2);	
		centro.vacunarPacienteCovid(nuevo, rubeola);	
		
	}
	
	

}
