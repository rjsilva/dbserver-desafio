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
public class CreateAnAccountSectionPage {

	@FindBy(id = "SubmitCreate")
	private WebElement buttonCreateAnAccount;
	
	@FindBy(id = "email_create")
	private WebElement inputEmailCreate;

	PersonalInformationSectionPage personalInformationSectionPage;
	
	AddressSectionPage addressSectionPage;
	
	ShippingSectionPage shippingSectionPage;
	
	PaymentMethodSectionPage paymentMethodSectionPage;
	
	OrderConfirmationSectionPage orderConfirmationSectionPage;
	
	public CreateAnAccountSectionPage(WebDriver driver) {
		
		this.personalInformationSectionPage = new PersonalInformationSectionPage(driver);
		this.addressSectionPage = new AddressSectionPage(driver);
		this.shippingSectionPage = new ShippingSectionPage(driver);
		this.paymentMethodSectionPage = new PaymentMethodSectionPage(driver);
		this.orderConfirmationSectionPage = new OrderConfirmationSectionPage(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getButtonCreateAnAccount() {
		return buttonCreateAnAccount;
	}

	public WebElement getInputEmailCreate() {
		return inputEmailCreate;
	}

	public PersonalInformationSectionPage getPersonalInformationSectionPage() {
		return personalInformationSectionPage;
	}

	public AddressSectionPage getAddressSectionPage() {
		return addressSectionPage;
	}

	public ShippingSectionPage getShippingSectionPage() {
		return shippingSectionPage;
	}

	public PaymentMethodSectionPage getPaymentMethodSectionPage() {
		return paymentMethodSectionPage;
	}

	public OrderConfirmationSectionPage getOrderConfirmationSectionPage() {
		return orderConfirmationSectionPage;
	}
	
	
}
