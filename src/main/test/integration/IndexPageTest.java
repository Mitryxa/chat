package integration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class IndexPageTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver(new FirefoxBinary(new File("E:/Andrew/Firefox/firefox.exe")),  new FirefoxProfile());
        driver.navigate().to("http://seleniumsimplified.com");
 //       driver.navigate().to("http://localhost:8080/");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
