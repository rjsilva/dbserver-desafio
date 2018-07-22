package br.com.dbserver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public enum Web implements WebApplication{
	
	CHROME {

		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver","chromedriver");
			return new ChromeDriver();
		}
		
	},
	
	CHROME_WINDOWS {

		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			return new ChromeDriver();
		}
		
	},
	
	FIREFOX {

		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			return new FirefoxDriver();
		}
		
	},


}
