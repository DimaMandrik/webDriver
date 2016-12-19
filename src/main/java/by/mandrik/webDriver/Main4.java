package by.mandrik.webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tut.by");
		WebElement element = driver.findElement(By.cssSelector("span.header"));
		System.out.println(element.getText());
		driver.findElement(By.className("entry-head")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
		//1 way
		StringBuilder bd = new StringBuilder(driver.findElement(By.id("article_body")).getText());
		int c = 0;
		for (int i=0;i<bd.length();i++){
			if (bd.charAt(i) == '\n'){
				c++;
			}
		}
		System.out.println(c);
		
		//2 way
		WebElement element1 = driver.findElement(By.id("article_body"));
		List<WebElement> elements = element1.findElements(By.tagName("p"));
		System.out.println(elements.size());
	}
}
