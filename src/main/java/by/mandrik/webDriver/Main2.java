package by.mandrik.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import by.mandrik.javaScript.MouseHover;

public class Main2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.it-academy.by");
		driver.findElement(By.cssSelector("li.menu-depth-1:nth-child(2) > a:nth-child(1)")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
		WebElement element = driver.findElement(By.cssSelector("li.expanded:nth-child(1) > a:nth-child(1)"));
		MouseHover ms = new MouseHover();
		ms.mouseHoverJScript(element, driver);
	}
}
