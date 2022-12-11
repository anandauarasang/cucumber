package stepdefinition;

import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class loginsteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
		
	}

	@And("clicks on login buton")
	public void clicks_on_login_buton() {
		System.out.println("clicks on login button");
		
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to home page");
		
	}

}
