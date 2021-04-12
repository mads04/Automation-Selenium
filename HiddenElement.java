package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		/*int count = 0;
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("Mys");
		Thread.sleep(3000L);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String text = "return document.getElementById(\"fromPlaceName\").value;";
		String Execute = (String) js.executeScript(text);
		while(!Execute.equalsIgnoreCase("MYSORE PALACE"))
		{
			count++;
			System.out.println(Execute);
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			Execute= (String) js.executeScript(text);
			if (count>15)
			{
				break;
			}
		}
		
		if (count>15)  
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Passed");
		}*/
		int count = 0;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Rus");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String logic = "return document.getElementById(\"autocomplete\").value;";
		String Execute = (String) js.executeScript(logic);
		while(!Execute.equalsIgnoreCase("Russian Federation"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			count++;
			Execute = (String) js.executeScript(logic);
			if (count>5)
			{
				break;
			}
		}
		
		if (Execute.equalsIgnoreCase("Russian Federation"))
		{
			System.out.println(Execute);
		}
		else
		{
			System.out.println("Incorrect code");
		}
	}

}
