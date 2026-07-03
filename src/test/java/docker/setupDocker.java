package docker;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class setupDocker {

    @BeforeSuite
    public void startDockerGrid() throws IOException, InterruptedException {

        System.out.println("Starting Docker Grid...");

        Process process = Runtime.getRuntime().exec("cmd /c startDocker_grid.bat");
        process.waitFor(); // Wait for the batch file to finish

        Thread.sleep(15000); // Give Docker Grid time to start

        System.out.println("Docker Grid Started.");
    }

    @AfterSuite
    public void stopDockerGrid() throws IOException, InterruptedException {

        System.out.println("Stopping Docker Grid...");

        Process process = Runtime.getRuntime().exec("cmd /c stopDocker_grid.bat");
        process.waitFor(); // Wait for the batch file to finish

        Thread.sleep(10000);

        System.out.println("Docker Grid Stopped.");
    }
}