package org.stepdefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.loginfo.Log4jPropertyConfigurator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Log4jPropertyConfigurator{

	@Given("User is on home page")
	public void user_is_on_home_page() {
		property();
		log.info("User is on home page");
	}

	@When("User enter the details")
	public void user_enter_the_details() {
		property();
		log.info("User enter the details");
	}


	@Then("user Click the ok button and user is on search page")
	public void user_Click_the_ok_button_and_user_is_on_search_page() {
		property();
		String s="Successfull";
		log.info("user Click the ok button and user is on search page:"+s);
	}




	@When("user enter the valid details")
	public void user_enter_the_valid_details() {
		property();
		log.info("user enter the valid details");
	}

	@Then("User click the ok")
	public void user_click_the_ok() {
		property();
		log.info("User click the ok");
	}

	@Then("User is navigating to payment page")
	public void user_is_navigating_to_payment_page() {
		property();
		String s="Successfull";
		log.info("User is navigating to payment page:"+s);
	}

	@When("User enter the payment info for purchasing the product")
	public void user_enter_the_payment_info_for_purchasing_the_product() {
		property();
		log.info("User enter the payment info for purchasing the product");
	}

	@Then("User enter the buy now button")
	public void user_enter_the_buy_now_button() {
		property();
		String s="Successfully paid";
		log.info("User enter the buy now button:"+s);
	}






}
