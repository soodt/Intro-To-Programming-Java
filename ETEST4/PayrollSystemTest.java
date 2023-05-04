import java.util.ArrayList;
public class PayrollSystemTest {

	
	public static void main(String[] args) {
	
		ArrayList<Employee> employees;
		
		employees = new ArrayList();
		
		employees.add(new SalariedEmployee("John", "Smith","111-11-1111",800));
		employees.add(new HourlyEmployee("Karen", "Price","222-22-2222",16.75,40));
		employees.add(new CommissionEmployee("Sue", "Jones","333-33-3333",10,0.06));
		employees.add(new BasePlusCommissionEmployee("Bob", "Lewis","444-44-444",5000,0.04,300));
		employees.add(new PieceWorker("Rick", "Bridges","555-55-5555",2.25,400));
		
		
		for (int i=0; i<employees.size(); i++ ) {
			
			System.out.println(employees.get(i));
			System.out.println("earned "+employees.get(i).earnings());
		}
		
	}
}
