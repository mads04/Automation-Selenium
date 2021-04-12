package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		WebElement source= driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("Mad");
		Thread.sleep(2000);
		for (int i=0; i<3;i++) {
		source.sendKeys(Keys.ARROW_DOWN);
		
		}
		source.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[2]")).click();
		WebElement dest= driver.findElement(By.xpath("//input[@placeholder='To']"));
		dest.sendKeys("CHE");
		Thread.sleep(4000);
	
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
		

		
		
	}

}
