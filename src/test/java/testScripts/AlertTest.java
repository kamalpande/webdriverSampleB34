package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][1]']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
        alert1.dismiss();
       // driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][2]']")).click();
		//Alert alert2 = driver.switchTo().alert().sendKeys("test");
		//System.out.println(alert2.getText());
		
        //alert2.accept();
        
	}

}
