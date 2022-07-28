package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_OrangeHrm {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // parent p=new Child For Starting ChromeDriver browser
		driver.manage().window().maximize(); // For Maximize browser

		driver.get("https://opensource-demo.orangehrmlive.com/");
		//CSS with id
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		//CSS with type

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		//Css with ClassName
		driver.findElement(By.cssSelector("input.button")).click();
		//Css with ClassName
		driver.findElement(By.cssSelector("a.panelTrigger")).click();
		Thread.sleep(2000);
		//Css with any property 
		driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();
		driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).click();
		Thread.sleep(3000);
		driver.quit();			
	}
}