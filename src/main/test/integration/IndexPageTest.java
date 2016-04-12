package integration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class IndexPageTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();
      //  driver.navigate().to("http://seleniumsimplified.com");
        driver.navigate().to("http://localhost:8080/");
        assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello World!");

        driver.close();
        driver.quit();
    }
}
