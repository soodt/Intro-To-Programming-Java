
public class Dog {
	
	public String breed;
	public int age;
	
	public void eat() {
		
	}
	
	public void run()
	{
		
	}
	
	public void setBreed(String dogBreed){
		
		breed=dogBreed;
	}
	

	public void setAge(int dogAge){
		
		age=dogAge;
	}
	
	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.breed="Mastiff";
		dog1.age=2;
		
				
		Dog dog2= new Dog();
		dog2.breed="Maltese";
		dog2.age=1;
		
	}
}
