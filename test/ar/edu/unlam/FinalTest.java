package ar.edu.unlam;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

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
	
	@Test (expected = TuvoHepatitisException.class)
	public void queUnPacienteQueTuvoHepatitisNoSePuedaDarLaVacuna() throws TuvoRubeolaException, TuvoHepatitisException {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);		
		Vacuna hepatitis = new HepatitisA();
		nuevo.darHepatitis();
		centro.vacunarPacienteHepatitis(nuevo, hepatitis);	
		
	}
	
	@Test (expected = TuvoRubeolaException.class)
	public void queUnPacienteQueTuvoRubeolaNoSePuedaDarLaVacuna() throws TuvoRubeolaException {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("Jorge", "Gonzalez",33333);		
		Vacuna rubeola = new Rubeola();
		nuevo.darRubeola();
		centro.vacunarPacienteRubeola(nuevo, rubeola);	
		
	}
	
	
	
	@Test
	public void presentarPacientesOrdenados() throws TuvoHepatitisException {
		CentroVacunarte centro = new CentroVacunarte("Centro de Vacunacion");
		Paciente nuevo = new Paciente("F", "Gonzalez",33333);
		Paciente nuevo1 = new Paciente("A", "Gonzalez",2222);	
		Paciente nuevo2 = new Paciente("B", "Gonzalez",1111);	
		Paciente nuevo3 = new Paciente("D", "Gonzalez",44444);
		Vacuna hepatitis = new HepatitisA();
		Vacuna hepatitis1 = new HepatitisA();
		Vacuna hepatitis2 = new HepatitisA();
		Vacuna hepatitis3 = new HepatitisA();
		centro.vacunarPacienteHepatitis(nuevo, hepatitis);	
		centro.vacunarPacienteHepatitis(nuevo1, hepatitis1);
		centro.vacunarPacienteHepatitis(nuevo2, hepatitis2);
		centro.vacunarPacienteHepatitis(nuevo3, hepatitis3);
		assertEquals(nuevo2,(((TreeSet) centro.getPacientesVacunados()).first()));
		assertEquals(nuevo3,(((TreeSet) centro.getPacientesVacunados()).last()));
	}
	
	

}
