package docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setupDocker {
	@BeforeTest
	void startDocekerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start startDocker_grid.bat");
		Thread.sleep(15000);
	}
	
	@AfterTest
	void stopDockerFrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start stopDocker_grid.bat");
		Thread.sleep(15000);
			
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
