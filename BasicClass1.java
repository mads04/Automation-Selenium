package selenimPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		String ParentPage = itr.next();
		String childPage = itr.next();
		driver.switchTo().window(childPage);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(ParentPage);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.quit();

	}

}
