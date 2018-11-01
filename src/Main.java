import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Input emp = new Input();
		System.out.print("Enter EmployeeID :");
		emp.setEmployeeID(in.next());
		System.out.print("Enter Name :");
		emp.setName(in.next());
		System.out.print("Enter Salary :");
		emp.setSalary(in.nextDouble());
		System.out.print("Enter Sales :");
		emp.setSales(in.nextDouble());
		
		CalCompensation compensation = new CalCompensation();
		double compen = compensation.calculateCompensation(emp.getSales(), emp.getSalary());
		
		Output empCompen = new Output();
		empCompen.printOutput(emp.getName(), compen);
	}

}
