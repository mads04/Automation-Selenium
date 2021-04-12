package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOne {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for = 'benz']/input")).click();
		String VisibleText = driver.findElement(By.xpath("//label[@for = 'benz']")).getText();
		System.out.println(VisibleText);
		Select s = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		s.selectByVisibleText(VisibleText);
		driver.findElement(By.cssSelector("#name")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys(VisibleText);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(VisibleText))
		{
		System.out.println("True");
	}
		else
		{
			System.out.println("False");
		}
}
}
