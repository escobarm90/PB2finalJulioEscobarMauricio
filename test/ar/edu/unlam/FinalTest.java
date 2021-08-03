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
	public void queSeConsidereVacunadoContraElCovidSoloCuandoTengaLasDosDosis() {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);
		Vacuna covid1 = new Covid19PrimerDosis();
		Vacuna covid2 = new Covid19SegundaDosis();
		
		centro.vacunarPaciente(nuevo, covid2);
		
	}

}
