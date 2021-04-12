package selenimPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> First= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		ArrayList<String> Original = new ArrayList<String>();
		ArrayList<String> copied = new ArrayList<String>();

		for(int i=0;i<First.size();i++)
		{
			Original.add(First.get(i).getText());
		}
		System.out.println(Original);
		for (int j=0;j<Original.size();j++)
		{
			copied.add(Original.get(j));
		}
		Collections.sort(copied);
		Collections.reverse(copied);
		System.out.println(copied);

		Assert.assertTrue(Original.equals(copied));
		System.out.println("Equal");
		

	}

}
