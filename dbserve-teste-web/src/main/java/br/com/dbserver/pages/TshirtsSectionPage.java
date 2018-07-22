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
public class TshirtsSectionPage {
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement buttonAddtoCart;
	
	@FindBy(xpath = "//div[@class='product-container']//a[@class='product-name']")
	private WebElement titleProductName;
	
	@FindBy(xpath = "//span[@class='available-now']")
	private WebElement titleInStock;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement buttonProceedTocheckout1;
	
	
	public TshirtsSectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getButtonAddtoCart() {
		return buttonAddtoCart;
	}

	public WebElement getTitleInStock() {
		return titleInStock;
	}

	public WebElement getButtonProceedTocheckout1() {
		return buttonProceedTocheckout1;
	}

	public void setButtonProceedTocheckout1(WebElement buttonProceedTocheckout1) {
		this.buttonProceedTocheckout1 = buttonProceedTocheckout1;
	}

	public WebElement getTitleProductName() {
		return titleProductName;
	}

}
