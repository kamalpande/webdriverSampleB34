package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext context = shadowHost.getShadowRoot();
		//WebElement shadowContent = driver.findElement(By.cssSelector("#shadow_content"));
		WebElement shadowContent = context.findElement(By.cssSelector("#shadow_content"));
		System.out.println("Text from shadow DOM .." +shadowContent.getText());

	}

}
