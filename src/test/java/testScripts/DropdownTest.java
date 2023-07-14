package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		Select senSel = new Select(driver.findElement(By.id("select-demo")));
		senSel.selectByVisibleText("Wednesday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		mulSel.selectByValue("California");
		
		
		
		

	}

}
