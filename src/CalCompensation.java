
public class CalCompensation {
	public double calculateCompensation(double sales,double salary) {
		double commission;
		double compensation;
		if(sales > 50000) {
			commission = sales * 0.03;
		}
		else if(sales > 25000) {
			commission = sales * 0.02;
		}
		else {
			commission = sales * 0.01;
		}
		if(salary + commission < 18000) {
			compensation = 18000;
		}else {
			compensation = commission + salary;
		}
		return compensation;
	}
}
