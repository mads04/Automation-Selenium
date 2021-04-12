package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://salesforce.com");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("MADHAN");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("MADHAN0989");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

	}

}
