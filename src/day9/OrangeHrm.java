package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// For Setting path of chromedriver.exe
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\Premchand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // parent p=new Child For Starting ChromeDriver browser
		driver.manage().window().maximize(); // For Maximize browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// For Opening Url
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);  // For Stopping Execution for 1 Sec since Selenium is Firing every command with equal speed
		// and my application is slow hence we have written here
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.quit(); // For Closing Browser
	}
}