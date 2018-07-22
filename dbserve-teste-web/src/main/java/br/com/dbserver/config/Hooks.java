package br.com.dbserver.config;


import br.com.dbserver.commons.BaseTest;
import br.com.dbserver.factory.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class Hooks extends BaseTest{
	
	@Before(value="@chrome")
	public void beforeScenarioChrome() {
		
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
		
	}
	
	@Before(value="@firefox")
	public void beforeScenarioFirefox() {
		
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.FIREFOX);

		
	}
	
	@Before(value="@chrome_windows")
	public void beforeScenarioChromeWindows() {
		
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.FIREFOX);
		
	}
	
	@After(value = "@chrome")
	public void afterScenarioWeb() {
		closeDriver();
	}

}
