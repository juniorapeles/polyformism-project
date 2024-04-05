package entities;

public class OutsourcedEmployee extends Employee  {
	 private Double additionalCharge;
	
	 
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}


	@Override
	public Double payment() {
		Double additionalChargeWithTax = additionalCharge * 1.1;
		return super.payment() + additionalChargeWithTax;
	}
}
