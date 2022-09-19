package Application;
import CredentialServices.Employee;

public class DriverClass {
	
	public static void main(String[] args) {
		
		Employee em1 = new Employee("Madhumati","Shirsat");
		
		System.out.println(em1.showinfo());
	}
}
