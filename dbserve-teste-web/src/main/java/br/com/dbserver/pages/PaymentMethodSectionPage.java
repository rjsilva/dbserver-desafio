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
public class PaymentMethodSectionPage {

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement linkPayByBankWire;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement linkPayByCheck;

	@FindBy(xpath = "//button[@type='submit']//span[text()='I confirm my order']")
	private WebElement buttonIConfirmMyOrder;
	
	public PaymentMethodSectionPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLinkPayByBankWire() {
		return linkPayByBankWire;
	}

	public WebElement getLinkPayByCheck() {
		return linkPayByCheck;
	}

	public WebElement getButtonIConfirmMyOrder() {
		return buttonIConfirmMyOrder;
	}
	
}
