package selenimPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RSAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")));
		WebElement firstColumn = footerDriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		String multitab = Keys.chord(Keys.CONTROL,Keys.ENTER);

		for(int i=1;i<firstColumn.findElements(By.tagName("a")).size();i++)
		{
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(multitab);
			Thread.sleep(5000L);
			
		}
		WebDriverWait w= new WebDriverWait(driver,30);
		w.until(ExpectedConditions.numberOfWindowsToBe(5));
		Set<String> s = driver.getWindowHandles();
		Iterator<String> Itr = s.iterator();
		while(Itr.hasNext())
		{
			driver.switchTo().window(Itr.next());
			System.out.println(driver.getTitle());
					}
		driver.quit();
	}

}
