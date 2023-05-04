
public class PieceWorker extends Employee {
	
	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName, 
      String socialSecurityNumber, double wage,int pieces ) 
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");
		if (pieces < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Pieces produced must be >= 0.0");
		this.wage= wage;
		this.pieces = pieces;
	}
	
	public double getWage() {
		
		return wage;
	}
	
	public double getPieces() {
		
		return pieces;
	}
	
	public void setWage(double wage) {
		
		if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");
		this.wage= wage;
		
	}
	
	public void setPieces(int pieces) {
		if (pieces < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Pieces produced must be >= 0.0");
		this.pieces = pieces;
		
	}
	 public String toString()                                              
	   { 
		 
		 return String.format("%s %s; %s: $%.2f",                       
		         "piece worker", super.toString(),                            
		         "wage per piece", getWage(),
		         "pieces produced", getPieces());	 
	   }
	
	
	public double earnings() {
		
		return getWage()*getPieces();
	}

}
