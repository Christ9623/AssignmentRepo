package Tugas5.Tugas5;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SignUp extends RequestDatafaker{
	
	@Test
	public void Daftar() {
		
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String payload = "{\r\n"
				+ "  \"first_name\": \""+firstName()+"\""+","
				+ "  \"last_name\": \""+lastName()+"\""+","
				+ "  \"email\": \""+requestEmail()+"\""+","
				+ "  \"password\": \""+password()+"\""+","
				+ "  \"phone_number\": \"+62-"+phoneNumber()+"\""
				+ "}";
		
		Response responseSignUp = RestAssured.given().contentType("application/json").body(payload).when().post("/users");
		System.out.println(payload);
		assertEquals(responseSignUp.statusCode(), 200);
		
	}
	
		
}

