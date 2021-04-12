package selenimPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.id("departureCalendar")).click();
		while (!driver.findElement(By.className("DayPicker-Caption")).getText().contains("August"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}  //Navigates to given month
		
		List<WebElement> Dates = driver.findElements(By.cssSelector("div.calDate"));
		int Count = Dates.size();
		for (int i=0;i<Count;i++)
		{
			String Text = Dates.get(i).getText();
			if(Text.equalsIgnoreCase("4"))
			{
				Dates.get(i).click();
			}
		}
	}

}
