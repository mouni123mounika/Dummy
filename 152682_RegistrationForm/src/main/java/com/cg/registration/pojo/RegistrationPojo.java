package com.cg.registration.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPojo {

	@FindBy(how = How.ID, id = "txtFirstName")
	private WebElement firstName;

	@FindBy(how = How.ID, id = "txtLastName")
	private WebElement lastName;

	@FindBy(how = How.ID, id = "txtEmail")
	private WebElement email;

	@FindBy(how = How.ID, id = "txtPhone")
	private WebElement contactNo;

	@FindBy(how = How.ID, id = "txtAddress1")
	private WebElement lineOne;

	@FindBy(how = How.ID, id = "txtAddress2")
	private WebElement lineTwo;

	@FindBy(how = How.NAME, name = "city")
	private WebElement city;

	@FindBy(how = How.NAME, name = "state")
	private WebElement state;

	@FindBy(how = How.LINK_TEXT, linkText = "Next")
	private WebElement nextLink;

	@FindBy(how = How.ID, id = "txtPercentage")
	private WebElement percentage;

	@FindBy(how = How.ID, id = "txtPassYear")
	private WebElement passyear;

	@FindBy(how = How.ID, id = "txtProjectName")
	private WebElement projectname;

	@FindBy(how = How.ID, id = "txtOtherTechs")
	private WebElement othertechs;

	@FindBy(how = How.NAME, name = "graduation")
	private WebElement graduation;

	@FindBy(how = How.NAME, name = "technologies")
	private WebElement technologies;

	@FindBy(how = How.ID, id = "btnRegister")
	private WebElement Register;

	public void clickNextPageLink() {
		nextLink.click();
	}

	public String getState() {
		return new Select(this.state).getFirstSelectedOption().getText();
	}

	public void setState(String state) {
		new Select(this.state).selectByVisibleText(state);
	}

	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();
	}

	public void setCity(String city) {
		new Select(this.city).selectByVisibleText(city);
	}

	public String getLineOne() {
		return lineOne.getAttribute("value");
	}

	public void setLineOne(String lineOne) {
		this.lineOne.sendKeys(lineOne);
	}

	public String getLineTwo() {
		return lineTwo.getAttribute("value");
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo.sendKeys(lineTwo);
	}

	public void setContactNo(String contactNo) {
		this.contactNo.clear();
		this.contactNo.sendKeys(contactNo);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getPercentage() {
		return percentage.getAttribute("value");
	}

	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}

	public String getPassyear() {
		return passyear.getAttribute("value");
	}

	public void setPassyear(String passyear) {
		this.passyear.sendKeys(passyear);
	}

	public String getProjectname() {
		return projectname.getAttribute("value");
	}

	public void setProjectname(String projectname) {
		this.projectname.sendKeys(projectname);
	}

	public String getOthertechs() {
		return othertechs.getAttribute("value");
	}

	public void setOthertechs(String othertechs) {
		this.othertechs.sendKeys(othertechs);
	}

	public String getGraduation() {
		return new Select(this.graduation).getFirstSelectedOption().getText();
	}

	public void setGraduation(String graduation) {
		new Select(this.graduation).selectByVisibleText(graduation);
	}

	public String getTechnologies() {
		return new Select(this.technologies).getFirstSelectedOption().getText();	}

	public void setTechnologies(String technologies) {
		if (technologies.equals("Java"))
			this.technologies.click();
		else if (technologies.equals(".Net"))
			this.technologies.click();
	}

	public void clickregister() {
		Register.click();
	}

}
