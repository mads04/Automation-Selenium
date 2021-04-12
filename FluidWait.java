package selenimPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Functions;


public final class FluidWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@class='example'] //button")).click();
		System.out.println(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());
		//WebDriver Wait
		//WebDriverWait w = new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
		//Fluent Wait
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(10000)).pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
		
		
		WebElement foo = w.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	if (driver.findElement(By.cssSelector("#finish h4")).isDisplayed())	
		    		return driver.findElement(By.cssSelector("#finish h4"));
		    	else
		    		return null;
		     }
		   });
		System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());
		driver.quit();
	}
		
}
