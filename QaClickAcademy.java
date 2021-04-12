package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QaClickAcademy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option1");
		s.selectByIndex(2);
		s.selectByVisibleText("Option3");
		//driver.close();
		System.out.println("Working");
		

	}

}
