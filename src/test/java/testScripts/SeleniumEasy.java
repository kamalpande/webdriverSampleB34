package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//driver.findElement(By.xpath("//td[contains(text (),'B. Wagner')]//following-sibling::td[5]"));
		System.out.println("salary" + driver.findElement(By.xpath("//td[contains(text (),'B. Wagner')]//following-sibling::td[5]")));

	}

}
