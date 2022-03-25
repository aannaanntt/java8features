package employee.management.app.consumer;

import java.util.function.Supplier;

public class Check {
	public static void main(String[] args) {
		Supplier<String> otps=()->{ 
		 String otp=""; 
			for(int i =1;i<=6;i++) 
			 { 
			 otp=otp+(int)(Math.random()*5); 
			 } 
			return otp;
	};
	System.out.println(otps.get());
		
	
	}
}
