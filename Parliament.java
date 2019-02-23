import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class Parliament {
        public static void main(String[] args) throws IOException,
InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://parliament.lk");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/map/area[6]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div/div[1]/ul/li[9]/a")).click();
		driver.findElement(By.id("hatts")).click();
		Thread.sleep(10000);
		//driver.findElement(By.id("summ2019")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.id("sum2019-02-08")).click();
		//driver.close();
		Thread.sleep(5000);
		//int s = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr")).size();
		
		for(int i=4;i<225;i++)
		{
			
                	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr["+i+"]")).getText());
		}

        }
}


