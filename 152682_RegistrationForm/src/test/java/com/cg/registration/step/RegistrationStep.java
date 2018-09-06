package com.cg.registration.step;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.pojo.RegistrationPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStep {

	private WebDriver driver;
	private RegistrationPojo pojo;

	@Before
	public void Initialization() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		pojo = new RegistrationPojo();
		PageFactory.initElements(driver, pojo);
	}

	@After
	public void teardown() {
		driver.close();
	}

	Logger log = Logger.getLogger(RegistrationPojo.class);

	// This is a test method to test all functions
	@Test
	public void test() throws Throwable {
		user_is_on_personal_Details_Form_page();
		user_select_Next_link_without_entering_FirstName();
		please_fill_the_First_Name_message_should_display();
		user_select_Next_link_without_entering_LastName();
		please_fill_the_Last_Name_message_should_display();
		user_select_Next_link_without_entering_Email();
		please_fill_the_Email_message_should_display();
		user_select_Next_link_after_entering_invalid_Email_address();
		please_enter_valid_Email_Id_message_should_display();
		user_select_Next_link_without_entering_Contact_No();
		please_fill_the_Contact_No_message_should_display();
		user_select_Next_link_after_entering_invalid_Contact_No();
		please_enter_valid_Contact_no_message_should_display();
		user_select_Next_link_without_selecting_Address();
		please_fill_the_Line_one_message_should_display();
		please_fill_the_Line_Two_message_should_display();
		user_select_Next_link_without_selecting_City();
		please_select_city_message_should_display();
		user_select_Next_link_without_selecting_State();
		please_select_state_message_should_display();
		user_select_Next_link_after_entering_Valid_set_of_information();
		personal_details_are_validated_and_accepted_successfully_message_should_display();
		user_is_on_Educational_Details_Form_page();
		user_select_Register_Me_link_without_entering_Graduation();
		please_Select_Graduation_message_should_display();
		user_select_Register_Me_link_without_entering_Percentage();
		please_fill_Percentage_detail_message_should_display();
		user_select_Register_Me_link_without_entering_Passing_Year();
		please_fill_Passing_Year_message_should_display();
		user_select_Register_Me_link_without_entering_Project_Name();
		please_fill_Project_Name_message_should_display();
		user_select_Register_Me_link_without_entering_Technologies_used();
		please_Select_Technologies_Used_message_should_display();
		user_select_Register_Me_link_without_entering_Other_Technologies();
		please_fill_other_Technologies_Used_message_should_display();
		user_select_Register_Me_link_after_entering_Valid_set_of_information();
		your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_message_should_display();

	}

	// This is a given method to enter personal details
	@Given("^User is on personal Details Form page$")
	public void user_is_on_personal_Details_Form_page() throws Throwable {
		driver.get("D:\\Selenium\\152682_RegistrationForm\\WebContent\\PersonalDetails.html");
		RegistrationStep register = new RegistrationStep();
		register.log.info(driver.getTitle());

	}

	// This is a when method to check firstname
	@When("^User select 'Next' link without entering 'FirstName'$")
	public void user_select_Next_link_without_entering_FirstName() throws Throwable {
		Thread.sleep(1000);
		pojo.clickNextPageLink();
		assertEquals("Please fill the First Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setFirstName("Mouni");
	}

	@When("^User select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Please fill the Last Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setLastName("Reddy");
	}

	@When("^User select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Please fill the Email", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();

	}

	@When("^User select 'Next' link after entering invalid 'Email' address$")
	public void user_select_Next_link_after_entering_invalid_Email_address() throws Throwable {
		pojo.setEmail("mouni");
		pojo.clickNextPageLink();
		assertEquals("Please enter valid Email Id.", driver.switchTo().alert().getText());
	}

	@Then("^'Please enter valid Email Id\\.' message should display$")
	public void please_enter_valid_Email_Id_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setEmail("mouni@gmail.com");
	}

	@When("^User select 'Next' link without entering 'Contact No'$")
	public void user_select_Next_link_without_entering_Contact_No() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Please fill the Contact No.", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Contact No\\.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();

	}

	@When("^User select 'Next' link after entering invalid 'Contact No'$")
	public void user_select_Next_link_after_entering_invalid_Contact_No() throws Throwable {
		pojo.setContactNo("98563210");
		pojo.clickNextPageLink();
		assertEquals("Please enter valid Contact no.", driver.switchTo().alert().getText());
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setContactNo("9874563210");
	}

	@When("^User select 'Next' link without selecting  'Address'$")
	public void user_select_Next_link_without_selecting_Address() throws Throwable {
		pojo.clickNextPageLink();
	}

	@Then("^'Please fill the Line one' message should display$")
	public void please_fill_the_Line_one_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setLineOne("l103");
	}

	@Then("^'Please fill the Line Two' message should display$")
	public void please_fill_the_Line_Two_message_should_display() throws Throwable {
		pojo.setLineTwo("Capgemini");
	}

	@When("^User select 'Next' link without selecting  'City'$")
	public void user_select_Next_link_without_selecting_City() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Please select city", driver.switchTo().alert().getText());
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setCity("Hyderabad");
	}

	@When("^User select 'Next' link without selecting  'State'$")
	public void user_select_Next_link_without_selecting_State() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Please select state", driver.switchTo().alert().getText());
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setState("Telangana");
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable {
		pojo.clickNextPageLink();
		assertEquals("Personal details are validated and accepted successfully.", driver.switchTo().alert().getText());
		Thread.sleep(5000);
	}

	// This is a then method to check next link
	@Then("^'Personal details are validated and accepted successfully' message should display$")
	public void personal_details_are_validated_and_accepted_successfully_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
	}

	@Given("^User is on Educational Details Form page$")
	public void user_is_on_Educational_Details_Form_page() throws Throwable {
	}

	@When("^User select 'Register Me' link without entering 'Graduation'$")
	public void user_select_Register_Me_link_without_entering_Graduation() throws Throwable {
		pojo.clickregister();
		assertEquals("Please Select Graduation", driver.switchTo().alert().getText());
	}

	@Then("^'Please Select Graduation' message should display$")
	public void please_Select_Graduation_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setGraduation("BE");

	}

	@When("^User select 'Register Me' link without entering 'Percentage'$")
	public void user_select_Register_Me_link_without_entering_Percentage() throws Throwable {
		pojo.clickregister();
		assertEquals("Please fill Percentage detail", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Percentage detail' message should display$")
	public void please_fill_Percentage_detail_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setPercentage("98");

	}

	@When("^User select 'Register Me' link without entering 'Passing Year'$")
	public void user_select_Register_Me_link_without_entering_Passing_Year() throws Throwable {
		pojo.clickregister();
		assertEquals("Please fill Passing Year", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Passing Year' message should display$")
	public void please_fill_Passing_Year_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setPassyear("2018");

	}

	@When("^User select 'Register Me' link without entering 'Project Name'$")
	public void user_select_Register_Me_link_without_entering_Project_Name() throws Throwable {
		pojo.clickregister();
		assertEquals("Please fill Project Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Project Name' message should display$")
	public void please_fill_Project_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setProjectname("java");

	}

	@When("^User select 'Register Me' link without entering 'Technologies used'$")
	public void user_select_Register_Me_link_without_entering_Technologies_used() throws Throwable {
		pojo.clickregister();
		assertEquals("Please Select Technologies Used", driver.switchTo().alert().getText());
	}

	@Then("^'Please Select Technologies Used' message should display$")
	public void please_Select_Technologies_Used_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setTechnologies("PHP");

	}

	@When("^User select 'Register Me' link without entering 'Other Technologies'$")
	public void user_select_Register_Me_link_without_entering_Other_Technologies() throws Throwable {
		pojo.clickregister();
	}

	@Then("^'Please fill other Technologies Used' message should display$")
	public void please_fill_other_Technologies_Used_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		pojo.setOthertechs("c");
		Thread.sleep(1000);
	}

	@When("^User select 'Register Me' link after entering Valid set of information$")
	public void user_select_Register_Me_link_after_entering_Valid_set_of_information() throws Throwable {
		pojo.clickregister();
		Thread.sleep(1000);
	}

	@Then("^'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' message should display$")
	public void your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_message_should_display()
			throws Throwable {
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
	}

}