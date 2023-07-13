package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.tagName("textarea"));
		schBox.sendKeys("Java Tutoarial");
		Thread.sleep(2000);
		

	}

}
