public class Item {
	
	private String code;
	private String name;
	private int quantity;

	public Item (String code, String name, int quantity) {
		
		this.code = code;
	    this.name = name;
	    this.quantity = quantity;
	    
	}
	
	public String toString() {
		return code + " | " + name + " | " + quantity;
	
	}

}
