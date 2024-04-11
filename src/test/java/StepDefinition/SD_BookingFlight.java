package StepDefinition;

import org.junit.Assert;

import com.AppPage.BookFlight;
import com.AppPage.LoginAction;
import com.AppPage.Registration;
import com.AppPage.SearchFlight;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_BookingFlight {
	BookFlight book=new BookFlight();
	LoginAction action=new LoginAction();
	Registration reg=new Registration();
	SearchFlight search=new SearchFlight();
	
	
	@Given("User do the registration using {string},{string},{string},{string},{string},{string}")
	public void user_do_the_registration_using(String email_id, String pwd, String pwd2, String name, String address, String city) {
	    String userRegistration= reg.userRegistration(email_id, pwd, pwd2, name, address, city);
	    Assert.assertEquals("Pass", userRegistration);
	}

	@And("User login with registration credentials using {string}, {string}")
	public void user_login_with_registration_credentials_using(String email_id, String pwd) {
	    String userLogin= action.userLogin(email_id, pwd);
	    Assert.assertEquals("Pass", userLogin);
	}

	@When("User search the flight")
	public void user_search_the_flight() {
	    String SearchingFlight= search.SearchingFlight();
	    Assert.assertEquals("Pass", SearchingFlight);
	}

	@Then("User Book the flight")
	public void user_book_the_flight() {
	    String bookingFlight= book.bookingFlight();
	    Assert.assertEquals("Pass", bookingFlight);
	}

}
