package br.com.dbserver.commons;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class SeleniumRobot extends BaseTest {

	public static void mouseOver(String xpath) {

		Actions action = new Actions(webDriver);
		WebElement btn = webDriver.findElement(By.xpath(xpath));
		action.moveToElement(btn).perform();
	}

	private static long timeout = 10;

	private static WebDriverWait waitDriver() {
		return new WebDriverWait(webDriver, 10);
	}

	public static void implicitlyWait(WebElement element) {
		webDriver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		waitDriver().until(ExpectedConditions.visibilityOf(element));
	}

	public static void explicitWait(WebElement element) {
		waitDriver().until(ExpectedConditions.visibilityOf(element));
	}

	public static void scroll(int rolagem) {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("window.scrollBy(0," + rolagem + ")", "");
	}

}
