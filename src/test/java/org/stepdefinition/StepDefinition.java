package org.stepdefinition;

import org.pom.Pom1;
import org.pom.Pom2;

import base.BaseClassCreation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClassCreation{
	
	@Given("User should enter {string},{string} and click the login button")
	public void user_should_enter_and_click_the_login_button(String username, String password) {
		Pom1 p=new Pom1();
		p.login(username, password);
	}

	@When("User should enter the {string},{string},{string},{string},{string},{string},{string},{string} and click the search button")
	public void user_should_enter_the_and_click_the_search_button(String location, String hotel, String roomtype, String noOfroom, String checkIn, String checkOut, String adultPerroom, String childPerroom) {
		Pom2 p=new Pom2();
		p.searchHotel(location, hotel, roomtype, noOfroom, checkIn, checkOut, adultPerroom, childPerroom);
	}

	@Then("User should validate that page should navigate to {string}")
	public void user_should_validate_that_page_should_navigate_to(String expectedResult) {
		Pom2 p=new Pom2();
		p.verifyTitle(expectedResult);
	}

	@When("User should enter the {string},{string},{string},{string},{string} and click search button")
	public void user_should_enter_the_and_click_search_button(String location, String noOfroom,String checkIn, String checkOut, String adultPerroom) {
		Pom2 p=new Pom2();
		p.clickSearchHotel(location, noOfroom, checkIn, checkOut, adultPerroom);
	}

	@When("User should enter the {string},{string},{string} and click search button")
	public void user_should_enter_the_and_click_search_button(String location, String checkIn, String checkOut) {
		Pom2 p=new Pom2();
		p.clickcheck(location, checkIn, checkOut);
	}
	

	@Then("User should validate the {string} and {string} messages is displayed.")
	public void user_should_validate_the_and_messages_is_displayed(String expectedResult, String expectedresult1) {
		Pom2 p=new Pom2();
		p.checkIncheckOut(expectedResult);
		p.checkout(expectedresult1);
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		Pom2 p=new Pom2();
		p.clickSubmit();
	}

	@Then("User should validate the {string} message is displayed.")
	public void user_should_validate_the_message_is_displayed(String expectedResult) {
		Pom2 p=new Pom2();
		p.errorMsg(expectedResult);
		
		
	}
}
