package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDradDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		//Actions a= new Actions(driver);
		//a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[frameborder = '1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name = 'frame-top']")));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[name='frameset-middle']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());

	}

}
