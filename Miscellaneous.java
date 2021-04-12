package selenimPackage;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk1.8.0_144\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Set<Cookie> cookieSet = driver.manage().getCookies();
		System.out.println(cookieSet);
		File fr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fr, new File("D:\\selenium-java-3.141.59\\Screenshots\\shot1.jpg"));
		
	}

}
