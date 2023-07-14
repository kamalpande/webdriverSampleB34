package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strlb1 = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println("Label from main page...." + strlb1);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello  Welcome");
		//frame1 to frame3
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		//frame3 to frame1
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		//from any frame to main page
		driver.switchTo().defaultContent();
		//from  main page to frame 2
		System.out.println(driver.findElement(By.xpath("//label/span")).getText());
		
	}

}
