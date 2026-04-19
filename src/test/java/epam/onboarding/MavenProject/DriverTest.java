package epam.onboarding.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class DriverTest {
	@Test
	public void getDriver()
	{
		String browserName=System.getProperty("browser");
		String baseUrl=System.getProperty("baseUrl");
		WebDriver driver;
		switch(browserName.toLowerCase())
		{
		case "edge" : driver = new EdgeDriver(new EdgeOptions().addArguments("--headless"));
		System.out.println("edge driver selected");
		break;
		case "firefox" : driver=new FirefoxDriver(new FirefoxOptions().addArguments("--headless"));
		System.out.println("firefox driver selected");
		break;
		default :
			driver=new ChromeDriver(new ChromeOptions().addArguments("--headless"));
			System.out.println("chrome driver selected");
		break;
		}
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
