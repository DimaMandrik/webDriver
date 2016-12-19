package by.mandrik.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.quizful.net/LoginAction.registration");
		driver.findElement(By.id("login")).sendKeys("Test_123321");
		driver.findElement(By.name("registrationForm.password")).sendKeys("1qaz!QAZ1q");
		driver.findElement(By.name("registrationForm.repassword")).sendKeys("1qaz!QAZ1q");
		driver.findElement(By.name("registrationForm.email")).sendKeys("panych_216@inbox.ru");
		driver.findElement(By.id("corporate")).click();
		driver.findElement(By.name("registrationForm.captcha")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("ok")).click();
		driver.quit();
	}

}
