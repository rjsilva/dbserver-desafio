package br.com.dbserver.functionality;

import java.util.Random;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;
import br.com.dbserver.commons.BaseTest;
import br.com.dbserver.commons.SeleniumRobot;
import br.com.dbserver.commons.Urls;
import br.com.dbserver.pages.HomePage;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class RealizarCompraOnlineFuncionalidade extends BaseTest {

	private HomePage homePage;
	private Faker faker;
	private Select select;
	private String orderConfirmation;
	private String productName;
	private Double valorCompra;
	private double totalShopping;
	private double unitprice;
	private int quantityProduct;

	public RealizarCompraOnlineFuncionalidade() {
		this.homePage = new HomePage(webDriver);
		this.faker = new Faker();

	}

	/**
	 * navega até a loja
	 */
	public void navigateToStore() {

		webDriver.get(Urls.URL_STORE);
		webDriver.manage().window().fullscreen();
	}

	/**
	 * escolhe o produto
	 */
	public void chooseProduct() {

		this.homePage.getTitleTshirts().click();
		SeleniumRobot.scroll(500);
		SeleniumRobot.mouseOver("//span[@class='available-now']");
		// pegar o titulo do produto escolhido
		productName = homePage.getTshirtsSectionPage().getTitleProductName().getText();
		SeleniumRobot.explicitWait(homePage.getTshirtsSectionPage().getButtonAddtoCart());
		this.homePage.getTshirtsSectionPage().getButtonAddtoCart().click();
		SeleniumRobot.explicitWait(homePage.getTshirtsSectionPage().getButtonProceedTocheckout1());
		this.homePage.getTshirtsSectionPage().getButtonProceedTocheckout1().click();

		// valida se existe produto no carrinho e se o produto é o mesmo que foi
		// adicionado no carrinho, caso exista prosegue com a compra
		if (!homePage.getShoppingCartSummarySectionPage().getInputCartQuantity().getAttribute("value").equals("")
				&& homePage.getShoppingCartSummarySectionPage().getTitleProductName().getText().equals(productName)) {
			//pegar os valores do carrinho
			unitprice = Double.parseDouble(homePage.getShoppingCartSummarySectionPage().getUnitPrice().getText().replace("$", ""));
			valorCompra = Double.parseDouble(homePage.getShoppingCartSummarySectionPage().getTotalprice().getText().replace("$", ""));
			totalShopping = Double.parseDouble(homePage.getShoppingCartSummarySectionPage().getTotalShipping().getText().replace("$", ""));
			quantityProduct = Integer.parseInt(homePage.getShoppingCartSummarySectionPage().getInputCartQuantity().getAttribute("value"));
			//realiza um scroll down
			SeleniumRobot.scroll(700);
			this.homePage.getShoppingCartSummarySectionPage().getButtonProceedTocheckout().click();
		} else {

			System.out.println(String.format("Não existe produto no carrinho",homePage.getShoppingCartSummarySectionPage().getInputCartQuantity().getText()));

		}
	}

	/**
	 * cadastra um cliente, caso o valor da compra estiver correto
	 */
	public void registerClient() {

		if (validTotalOfShopping()) {
			SeleniumRobot.scroll(50);
			this.homePage.getCreateAnAccountSectionPage().getInputEmailCreate().sendKeys(faker.lorem().characters(10) + "@gmail.com");
			this.homePage.getCreateAnAccountSectionPage().getButtonCreateAnAccount().click();
			SeleniumRobot.explicitWait(homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getRadioMr());
			this.homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getRadioMr().click();
			this.homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getInputFirstName().sendKeys(faker.name().firstName());
			this.homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getInputLastName().sendKeys(faker.name().lastName());
			this.homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getInputPassword().sendKeys(faker.lorem().characters(8));
			SeleniumRobot.scroll(300);
			select = new Select(homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getSelectDays());
			select.selectByIndex(new Random().nextInt(10) + 1);
			select = new Select(homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getSelectMonths());
			select.selectByIndex(new Random().nextInt(10) + 1);
			select = new Select(homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getSelectYear());
			select.selectByValue("1986");
			this.homePage.getCreateAnAccountSectionPage().getPersonalInformationSectionPage().getCheckBoxNewsletter().click();

			// section address
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputCompany().sendKeys(faker.company().name());
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputAddress1().sendKeys(faker.address().streetName());
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputAddress2().sendKeys(faker.address().streetName());
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputCity().sendKeys(faker.address().city());
			SeleniumRobot.scroll(200);
			select = new Select(this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getSelectState());
			select.selectByIndex(new Random().nextInt(10) + 1);
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputPostcode().sendKeys("35801");
			select = new Select(homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getSelectCountry());
			select.selectByIndex(1);
			SeleniumRobot.scroll(300);
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getTextAreaAddtionalInformation().sendKeys(faker.lorem().characters(20));
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputHomePhone().sendKeys("41625132");
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputMobilePhone().sendKeys(faker.phoneNumber().cellPhone());
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getInputAssignAnAddress().sendKeys(faker.lorem().characters(20));
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getButtonRegister().click();
			SeleniumRobot.scroll(700);
			this.homePage.getCreateAnAccountSectionPage().getAddressSectionPage().getButtonProcessAddress().click();

		}else {
			
			System.out.println(String.format("total da compra inválida"));
			
		}

	}

	/**
	 * aceita os termos
	 */
	public void acceptTerms() {
		SeleniumRobot.scroll(700);
		this.homePage.getCreateAnAccountSectionPage().getShippingSectionPage().getRadioTermsOfService().click();
		this.homePage.getCreateAnAccountSectionPage().getShippingSectionPage().getButtonProcessCarrier().click();
	}

	/**
	 * 
	 * @return ordem de confirmação
	 */
	public String choosePaymentMethod() {

		SeleniumRobot.scroll(700);
		this.homePage.getCreateAnAccountSectionPage().getPaymentMethodSectionPage().getLinkPayByBankWire().click();
		SeleniumRobot.explicitWait(homePage.getCreateAnAccountSectionPage().getPaymentMethodSectionPage().getButtonIConfirmMyOrder());
		this.homePage.getCreateAnAccountSectionPage().getPaymentMethodSectionPage().getButtonIConfirmMyOrder().click();
		orderConfirmation = this.homePage.getCreateAnAccountSectionPage().getOrderConfirmationSectionPage().getTitleOrderConfirmation().getText();
		return orderConfirmation;
	}

	/**
	 * 
	 * @return true se o valor da compra está correto
	 */
	public boolean validTotalOfShopping() {


		if (unitprice == (valorCompra / quantityProduct) - totalShopping) {
			return true;
		}

		return false;
	}
}
