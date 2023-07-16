package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterAccountTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kamal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kpande04@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aus@123");
		
		JavascriptExecutor sl = (JavascriptExecutor) driver;
		sl.executeScript("window.scrollBy(0,250)", "");
		
		WebElement btys =driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")); 
		//actions.moveToElement(radio).click().build().perform();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", btys);
		Thread.sleep(2000);
		
		
		WebElement tcbox= driver.findElement(By.xpath("//input[@name='agree']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", tcbox);
		Thread.sleep(2000);
		
		/*for(int i=0;i<2;i++)
		{
			tcbox.click();
			System.out.println(tcbox.isSelected());
		}*/
		//Thread.sleep(2000);
		//actions.moveToElement(tcbox).click().build().perform();
		
		WebElement smt= driver.findElement(By.xpath("//button[@type='submit']"));
		actions.moveToElement(smt).click().build().perform();
		smt.submit();
		
		/*WebElement smt= driver.findElement(By.xpath("//button[@class='btn btn-primary' and @type='submit']"));
		JavascriptExecutor bt = (JavascriptExecutor) driver;
		bt.executeScript("arguments[0].click();", smt);*/
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary' and @type='submit']"))).click();
		
		
		
		

	}

}
