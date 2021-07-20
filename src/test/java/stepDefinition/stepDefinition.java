package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {

		System.out.println("navigate to url");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("Login succefully");

	}
	
	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);


    }


	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {

		System.out.println("pop up message appears");

	}

	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {

		System.out.println(strArg1);
		

    }


}