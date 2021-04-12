package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		  WebDriver driver = new ChromeDriver();
		  /*driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  //System.out.println("Yes!!!");
		  driver.get("https://yahoo.com");
		  driver.navigate().back(); */
		  driver.get("https://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("Madhan");
		  driver.findElement(By.xpath("//input[@value='Log In']")).click();
		  //driver.findElement(By.linkText("Forgotten account?")).click();
		  System.out.println(driver.findElement(By.cssSelector("#error_box > div.fsl.fwb.fcb")).getText());
		  
	}

}
