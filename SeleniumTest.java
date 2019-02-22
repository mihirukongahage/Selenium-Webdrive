import java.io.IOException;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
        public static void main(String[] args) throws IOException,
InterruptedException {
		
		//Driver Initialization
                System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();

                //chromeOptions.addArguments("--headless");
                //chromeOptions.addArguments("--no-sandbox");
                WebDriver driver = new ChromeDriver(chromeOptions);

		//Launch web page
                driver.get("https://google.com");
                Thread.sleep(1000);

		//Send text to the text field
		driver.findElement(By.name("q")).sendKeys("UCSC Sri Lanka");
		Thread.sleep(5000);

		//click the search button
		driver.findElement(By.name("btnK")).click();

                driver.quit();
        }
}
