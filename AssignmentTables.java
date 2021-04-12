package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement Table= driver.findElement(By.cssSelector("#product"));
		int RowCount = (Table.findElements(By.tagName("tr")).size())-1;
		int ColumnCount= Table.findElements(By.tagName("th")).size();
		System.out.println(RowCount);
		System.out.println(ColumnCount);
		String secondRow=Table.findElement(By.cssSelector("[id='product']  tbody tr:nth-child(3)")).getText();
		System.out.println(secondRow);

	}

}
