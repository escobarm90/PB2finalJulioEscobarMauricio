package ar.edu.unlam;

public class Covid19PrimerDosis extends Vacuna{

	private final Integer id = 1;
	
	public Covid19PrimerDosis() {		
	
	}

	public Integer getId() {
		return this.id;
	}

	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}
	
	



	
	

}
