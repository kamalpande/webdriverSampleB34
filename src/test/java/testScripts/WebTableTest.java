package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		Thread.sleep(2000);
		WebElement closeIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));
		System.out.println("closeIcon.." + closeIcon.isDisplayed());
		driver.findElement(By.cssSelector("#searchBar")).sendKeys("test");
		Thread.sleep(2000);
		closeIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));
		if(closeIcon.isDisplayed())
		{
			closeIcon.click();

	     }
		System.out.println("close Icon after text.." + closeIcon.isDisplayed());

}
}
