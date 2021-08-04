package ar.edu.unlam;

public class Covid19SegundaDosis extends Vacuna{

	private final Integer id = 2;
	
	public Covid19SegundaDosis() {
		
		
	}
	
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}

}
