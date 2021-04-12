package selenimPackage;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesHandle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		int RunsRowCount=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20276/ban-vs-ind-match-40-icc-cricket-world-cup-2019");
		int sum=0;
		//WebElement Table = driver.findElement(By.xpath("//div[@id='innings_1'] //div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));
		WebElement Table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));


		
		RunsRowCount=Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		System.out.println(RunsRowCount);
		for (int i=0;i<RunsRowCount-2;i++)
		{
			String a= Table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			int Batting=Integer.parseInt(a);
			sum=sum+Batting;
		
		}
		int i = Integer.parseInt(Table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText());
		int GrandTotal= sum+i;
		System.out.println(GrandTotal);
		int j = Integer.parseInt(Table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText());
		if (GrandTotal==j)
		{
			System.out.println("Fuck Yes");
		}
		else
		{
			System.out.println("Fuck No");
		}
	}


}
