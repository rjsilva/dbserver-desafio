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
public class OrderConfirmationSectionPage {

	@FindBy(xpath = "//div[@class='box']//strong[text()='Your order on My Store is complete.']")
	private WebElement titleOrderConfirmation;

	public OrderConfirmationSectionPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getTitleOrderConfirmation() {
		return titleOrderConfirmation;
	}
}
