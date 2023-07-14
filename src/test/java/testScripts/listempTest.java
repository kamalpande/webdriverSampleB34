package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listempTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement table = driver.findElement(By.className("display dataTable no-footer"));
		List<WebElement> rows = table.findElements(By.name("San Francisco"));

        for(WebElement name:rows ){

            System.out.println(name.getText());

    }

	}

}
