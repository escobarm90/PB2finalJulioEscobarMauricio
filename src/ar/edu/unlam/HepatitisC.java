package ar.edu.unlam;

public class HepatitisC extends Vacuna{

	private final Integer id = 5;
	
	public HepatitisC() {
		
		
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public int compareTo(Vacuna o) {
		return this.id.compareTo(o.getId());
	
	}
	
	
	
	

}
