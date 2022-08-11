package Tugas5.Tugas5;

import com.github.javafaker.Faker;

public class RequestDatafaker {
	
	Faker fake = new Faker();
	
	public String requestEmail() {
		
		return fake.name().firstName()+lastName()+"@gmail.com";
		
	}
	
	public String fullName() {
		
		return fake.name().fullName();
		
	}
	
	public String firstName() {
		
		return fake.name().firstName();
		
	}
	
	public String lastName() {
		
		return fake.name().lastName();
		
	}
	
	public String password() {
		
		return fake.name().firstName() + "123";
		
	}
	
	public String phoneNumber() {
		
		return fake.phoneNumber().cellPhone().replace("-", "");
		
	}

}
