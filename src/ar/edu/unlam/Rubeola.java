package ar.edu.unlam;

public class Rubeola extends Vacuna {

	private final Integer id = 6;
	
	public Rubeola() {
		
	
	}

	
	public Integer getId() {
		return id;
	}


	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}
	
	
	
}
