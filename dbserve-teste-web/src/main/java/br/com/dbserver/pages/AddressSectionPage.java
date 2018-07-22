package br.com.dbserver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class AddressSectionPage {
	
	@FindBy(id = "firstname")
	private WebElement inputFirstName;
	
	@FindBy(id = "lastname")
	private WebElement inputLastName;
	
	@FindBy(id = "company")
	private WebElement inputCompany;
	
	@FindBy(id = "address1")
	private WebElement inputAddress1;
	
	@FindBy(id = "address2")
	private WebElement inputAddress2;
	
	@FindBy(id = "city")
	private WebElement inputCity;
	
	@FindBy(id = "id_state")
	private WebElement selectState;
	
	@FindBy(id = "postcode")
	private WebElement inputPostcode;
	
	@FindBy(id = "id_country")
	private WebElement selectCountry;
	
	@FindBy(id = "other")
	private WebElement textAreaAddtionalInformation;
	
	@FindBy(id = "phone")
	private WebElement inputHomePhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement inputMobilePhone;
	
	@FindBy(id = "alias")
	private WebElement inputAssignAnAddress;
	
	@FindBy(id = "submitAccount")
	private WebElement buttonRegister;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement buttonProcessAddress;	
	
	public AddressSectionPage(WebDriver driver){
	
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getInputCompany() {
		return inputCompany;
	}

	public WebElement getInputAddress1() {
		return inputAddress1;
	}

	public WebElement getInputAddress2() {
		return inputAddress2;
	}

	public WebElement getInputCity() {
		return inputCity;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getInputPostcode() {
		return inputPostcode;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getTextAreaAddtionalInformation() {
		return textAreaAddtionalInformation;
	}

	public WebElement getInputHomePhone() {
		return inputHomePhone;
	}

	public WebElement getInputMobilePhone() {
		return inputMobilePhone;
	}

	public WebElement getInputAssignAnAddress() {
		return inputAssignAnAddress;
	}

	public WebElement getButtonRegister() {
		return buttonRegister;
	}

	public WebElement getButtonProcessAddress() {
		return buttonProcessAddress;
	}

	
}
