package by.mandrik.webDriver; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main1 {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.by");
		WebElement element = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		element.sendKeys("java");
		element.submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (driver.getTitle().startsWith("java")){
			System.out.println("JAVA exists in title");
		};
		driver.quit();
	}
}