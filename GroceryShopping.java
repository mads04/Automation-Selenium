package selenimPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroceryShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String Req = "Cucumber"; 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(50000);
		List<WebElement> Cart = driver.findElements(By.cssSelector("//button[text()='ADD TO CART']"));
		
		for(int i=0;i<Cart.size();i++)
		{
			String Vegetable = Cart.get(i).getText();
			
			if (Vegetable.contains(Req))
				{
					driver.findElements(By.cssSelector("//button[text()='ADD TO CART']")).get(i).click();
					break;
					}			
			
		}
			
		

	}

}
