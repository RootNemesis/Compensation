
public class CalCompensation {
	public double calculateCompensation(double sales,double salary) {
		double commission;
		double compensation;
		if(sales > 100000) {
			commission = sales * 0.03;
		}
		else if(sales > 50000) {
			commission = sales * 0.02;
		}
		else {
			commission = sales * 0.01;
		}

		if(salary < 15000 && sales > 100000){
			compensation = commission + salary + 3000;
		}else{
			compensation = commission + salary;
		}
		
		return compensation;
	}
}
