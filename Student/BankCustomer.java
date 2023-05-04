
public class BankCustomer {
	
	int accountNumber;
	String customerName;
	String customerAddress;
	int customerDateOfBirth;
	
	
	public int getAccountNumber() {
		
		return accountNumber;
	}
	
	public String getCustomerName() {
		
		return customerName;
	}
	
	public String getCustomerAddress() {
		
		return customerAddress;
	}
	
	public int getcustomerDateOfBirth() {
		
		return customerDateOfBirth;
	}
	
	public void setAccountNumber(int newAccountNumber) {
		
		accountNumber=newAccountNumber;
	}
	
	public void setCustomerName(String newCustomerName) {
		
		customerName=newCustomerName;
		
	}
	
	public void setCustomerAddress(String newCustomerAddress) {
		
		customerAddress=newCustomerAddress;
	}
	
	public void setCustomerDateOfBirth(int newCustomerDateOfBirth) {
		
		customerDateOfBirth=newCustomerDateOfBirth;
	}

	public static void main(String[] args) {
		
		
		BankCustomer Tanuj= new BankCustomer();
		
		Tanuj.setAccountNumber(21356526);
		Tanuj.setCustomerName("Tanuj Sood");
		Tanuj.setCustomerAddress("Ardcairn House");
		Tanuj.setCustomerDateOfBirth(70902002);
		
	}

}
