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
public class HomePage {

	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Women']")
	private WebElement titleWomen;
	
	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Dresses']")
	private WebElement titleDresses;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a[@title='T-shirts']")
	private WebElement titleTshirts;
	
	@FindBy(xpath = "//div[@class='product-image-container']")
	private WebElement imgProductImage;

	private CreateAnAccountSectionPage createAnAccountSectionPage;
	
	private TshirtsSectionPage tshirtsSectionPage;
	
	private ShoppingCartSummarySectionPage shoppingCartSummarySectionPage;
	
	public HomePage(WebDriver driver) {
		
		this.createAnAccountSectionPage = new CreateAnAccountSectionPage(driver);
		this.tshirtsSectionPage = new TshirtsSectionPage(driver);
		this.shoppingCartSummarySectionPage = new ShoppingCartSummarySectionPage(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTitleWomen() {
		return titleWomen;
	}

	public WebElement getTitleDresses() {
		return titleDresses;
	}

	public WebElement getTitleTshirts() {
		return titleTshirts;
	}

	public CreateAnAccountSectionPage getCreateAnAccountSectionPage() {
		return createAnAccountSectionPage;
	}

	public WebElement getImgProductImage() {
		return imgProductImage;
	}

	public TshirtsSectionPage getTshirtsSectionPage() {
		return tshirtsSectionPage;
	}

	public ShoppingCartSummarySectionPage getShoppingCartSummarySectionPage() {
		return shoppingCartSummarySectionPage;
	}
	
}
