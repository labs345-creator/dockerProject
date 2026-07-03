package docker;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class dockerWithChrome {

	public static void main(String[] args) throws MalformedURLException {
		//ChromeOptions options = new ChromeOptions();
		EdgeOptions options = new EdgeOptions();
		//options.addArguments("--start-maximized");
	//	options.addArguments("--width=1920"); + --height=1080
		options.setAcceptInsecureCerts(true);
		
		//WebDriver driver = new ChromeDriver(options);
		
		//options.setCapability("browserVersion", "latest");
		//options.setCapability("platformName", "Windows 11");
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.quit();

		

	}

}
