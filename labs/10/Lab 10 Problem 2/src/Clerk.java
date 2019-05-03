
public class Clerk extends Employee{
	Clerk(String name, double age,double hourRate) {
		super(name, age, hourRate);
	}

	@Override
	public double salary(double hours) {
		return 0;
	}

	}

