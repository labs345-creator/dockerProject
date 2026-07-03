package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class chromeTest3 {
	
	@Test
	public void test3() throws MalformedURLException {
		EdgeOptions options = new EdgeOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
