
public class Input {
	public String employeeID;
	public String name;
	public double salary;
	public double sales;
	
	public Input() {
		
	}
	public Input(String employeeID, String name, double salary, double sales) {
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.sales = sales;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	
	
}
