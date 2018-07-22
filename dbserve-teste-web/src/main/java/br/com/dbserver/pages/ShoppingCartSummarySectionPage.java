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
public class ShoppingCartSummarySectionPage {

	@FindBy(id = "cart_quantity_up_1_1_0_0")
	private WebElement linkCartQuantityUp;
	
	@FindBy(name = "quantity_1_1_0_0_hidden")
	private WebElement inputCartQuantity;
	
	@FindBy(id = "cart_quantity_down_1_1_0_0")
	private WebElement linkCartQuantityDown;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]//span[text()='Proceed to checkout']")
	private WebElement buttonProceedTocheckout;
	
	@FindBy(xpath = "//div[@id='order-detail-content']//a[text()='Faded Short Sleeve T-shirts']")
	private WebElement titleProductName;
	
	@FindBy(xpath = "//span[@id='product_price_1_1_0']//span[@class='price']")
	private WebElement unitPrice;
	
	@FindBy(xpath = "//*[@id=\"total_shipping\"]")
	private WebElement totalShipping;
	
	@FindBy(xpath = "//*[@id=\"total_price\"]")
	private WebElement totalprice;
	
	public ShoppingCartSummarySectionPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLinkCartQuantityUp() {
		return linkCartQuantityUp;
	}

	public WebElement getLinkCartQuantityDown() {
		return linkCartQuantityDown;
	}

	public WebElement getInputCartQuantity() {
		return inputCartQuantity;
	}

	public WebElement getButtonProceedTocheckout() {
		return buttonProceedTocheckout;
	}

	public WebElement getTitleProductName() {
		return titleProductName;
	}

	public WebElement getUnitPrice() {
		return unitPrice;
	}

	public WebElement getTotalShipping() {
		return totalShipping;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	
}
