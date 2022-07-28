package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // parent p=new Child For Starting ChromeDriver browser
		driver.manage().window().maximize(); // For Maximize browser
		
		driver.get("https://blazedemo.com/");
		WebElement fp=driver.findElement(By.name("fromPort"));
		
		Select port1=new Select(fp);  // Select class is used for working with dropdown
		port1.selectByVisibleText("Portland");
		Thread.sleep(2000);
		port1.selectByIndex(6);
		Thread.sleep(2000);
		port1.selectByValue("Philadelphia");
		
		System.out.println("Multi Select Option is "+port1.isMultiple());
		
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		
		//Using common property we find all Objects/Elements which is having same property
		List<WebElement> flights=driver.findElements(By.cssSelector("input[value='Choose This Flight']"));
		
		System.out.println("Total available flights are "+flights.size());
		flights.get(1).click();
		
		

	}

}
