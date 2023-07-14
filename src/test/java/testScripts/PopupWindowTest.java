package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Handle" +parentWin );
		driver.findElement(By.xpath("//button[contains(text(),' new Tab ')]")).click();
		driver.manage().window().maximize();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("" +tabs.size());
		for(String child: tabs) {
			System.out.println(child);
			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
			}
		}
		
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
		//driver.quit();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		driver.quit();
		
		

	}

}
