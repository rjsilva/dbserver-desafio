package br.com.dbserver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Ronaldo Sillva
 *
 */
public class PersonalInformationSectionPage {

	@FindBy(id = "id_gender1")
	private WebElement radioMr;
	
	@FindBy(id = "id_gender2")
	private WebElement radioMrs;
	
	@FindBy(id = "customer_firstname")
	private WebElement inputFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement inputLastName;
	
	@FindBy(id = "email")
	private WebElement inputEmail;
	
	@FindBy(id = "passwd")
	private WebElement inputPassword;
	
	@FindBy(id = "days")
	private WebElement selectDays;
	
	@FindBy(id = "months")
	private WebElement selectMonths;
	
	@FindBy(id = "years")
	private WebElement selectYear;
	
	@FindBy(id = "newsletter")
	private WebElement checkBoxNewsletter;
	
	@FindBy(id = "optin")
	private WebElement checkBoxOptin;
	
	PersonalInformationSectionPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioMr() {
		return radioMr;
	}

	public WebElement getRadioMrs() {
		return radioMrs;
	}

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getSelectDays() {
		return selectDays;
	}

	public WebElement getSelectMonths() {
		return selectMonths;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCheckBoxNewsletter() {
		return checkBoxNewsletter;
	}

	public WebElement getCheckBoxOptin() {
		return checkBoxOptin;
	}
	
}
