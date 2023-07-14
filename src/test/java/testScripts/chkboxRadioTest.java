package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkboxRadioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement optChk = driver.findElement(By.xpath("//input[@class='cb1-element']//following::input[1]"));
		if(!optChk.isSelected())
		{
            optChk.click();
	}

}
}
