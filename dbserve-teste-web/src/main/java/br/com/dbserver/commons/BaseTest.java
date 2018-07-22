package br.com.dbserver.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.dbserver.factory.WebApplication;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class BaseTest {
	
	
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;
	
	protected void initializeWebApplication(WebApplication webApplication) {
		
		webDriver = webApplication.getDriver();
		webDriver.manage().window().fullscreen();
	}
	
	/**
	 * fecha o browser após os testes serem finalizados
	 */
	public void closeDriver() {
		
		webDriver.quit();
	}
	

}
