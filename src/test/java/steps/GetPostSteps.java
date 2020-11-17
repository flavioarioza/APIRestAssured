package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import utilities.RestAssuredFactory;

public class GetPostSteps {
	
	private static ResponseOptions<Response> response;
	String url_API;
	
	@Given("I have access to the API with the list of users")
	public void that_I_have_access_to_the_user_list(String url) {
	    url_API = url;
	}

	@When("I request the listing of all users")
	public void i_request_the_listing_of_all_users() {
		response = RestAssuredFactory.GetExc(url_API);
	}

	@Then("I see that the return of the list occurs successfully")
	public void i_see_the_listing_with_all_users_and_their_data_displayed_correctly() {
		assertEquals(200, response.getStatusCode());
	}


}
