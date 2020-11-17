package utilities;

import java.net.URI;
import java.net.URISyntaxException;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredFactory {
	
	public static RequestSpecification Request;
	
	public RestAssuredFactory(){
	
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("");
		builder.setContentType(ContentType.JSON);
		
		var requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);		
	}	
	
	public static Response GetExc(String url){
		
		try{
			
			return Request.get(new URI(url));
		}catch (URISyntaxException e){
			
			e.printStackTrace();
		}
		
		return null;
		
	}
}
