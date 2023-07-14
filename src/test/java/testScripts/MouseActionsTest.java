package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		WebElement srchBox = driver.findElement(By.name("search"));
		srchBox.sendKeys("phone");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Screenshots\\Fullscreen.png"));
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		WebElement subMenu = driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		actions.moveToElement(menu).click(subMenu).build().perform();
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("(//button[@data-bs-original-title='Add to Cart'])[1]"));
		File imgSrc = img.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imgSrc, new File("C:\\Screenshots\\Imagescreen.png"));
	}

}
