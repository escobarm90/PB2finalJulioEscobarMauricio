package ar.edu.unlam;

public class HepatitisA extends Vacuna{

	private final Integer id = 3;
	
	public HepatitisA() {
		
		
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}

}
