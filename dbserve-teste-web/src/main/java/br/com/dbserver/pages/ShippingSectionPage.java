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
public class ShippingSectionPage {

	@FindBy(id = "cgv")
	private WebElement radioTermsOfService;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement buttonProcessCarrier;
	
	public ShippingSectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioTermsOfService() {
		return radioTermsOfService;
	}

	public WebElement getButtonProcessCarrier() {
		return buttonProcessCarrier;
	}
}
