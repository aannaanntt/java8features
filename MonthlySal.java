package employee.management.app.consumer;

import java.util.function.BiFunction;

class Emp {
	int eno;
	String name;
	double dailywage;

	public Emp(int eno, String name, double dailywage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailywage = dailywage;
	}

}

class TimeSheet {
	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}

}

public class MonthlySal {
	
	public static void main(String[] args) {
		Emp e = new Emp(101,"Durga",1500);
 		TimeSheet tm = new TimeSheet(101,31);
 		BiFunction<Emp, TimeSheet, Double> bi=(emp,ts)-> emp.dailywage * ts.days;
	
 		System.out.println(bi.apply(e, tm));
	}

}
