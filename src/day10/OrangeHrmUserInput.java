package day10;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmUserInput {

	public static void main(String[] args) throws InterruptedException {
		// System.out.println(System.getProperty("user.dir"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName & Password");
		String un = sc.next();
		String pass = sc.next();

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // parent p=new Child For Starting ChromeDriver browser
		driver.manage().window().maximize(); // For Maximize browser

		driver.get("https://opensource-demo.orangehrmlive.com/");// For Opening Url
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();

		if (driver.getCurrentUrl().contains("dashboard")) {
			Thread.sleep(3000);

			driver.findElement(By.id("welcome")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Login Done");
		} else
			System.out.println("Login Failed");

		driver.quit();
	}
}