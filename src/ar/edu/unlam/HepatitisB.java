package ar.edu.unlam;

public class HepatitisB extends Vacuna{

	private final Integer id = 4;
	
	public HepatitisB() {
		
	
	}
	
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}


}
