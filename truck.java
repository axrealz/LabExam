public class truck {
	
	private String plate;
	private String driver;

	public truck (String plate, String driver) {
		
		this.plate = plate;
	    this.driver = driver;
	    
	}
	
	public String toString() {
	    return plate + " | " + driver;

	}

}
