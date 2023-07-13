package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		WebElement srchBox = driver.findElement(By.name("search"));
		srchBox.sendKeys("phone");
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		WebElement subMenu = driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		actions.moveToElement(menu).click(subMenu).build().perform();
		
		

	}

}
