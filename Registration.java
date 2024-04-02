package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nmadishetti\\Eclipse new version\\Java_Automation\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\nmadishetti\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement firstname = driver.findElement(By.xpath("//*[@ng-model='FirstName']"));
		firstname.sendKeys("Nikhitha");

		String firstname1 = firstname.getAttribute("value");
		System.out.println(firstname1);

		WebElement lastname = driver.findElement(By.xpath("//*[@ng-model='LastName']"));
		lastname.sendKeys("Madishetti");

		String lastname1 = lastname.getAttribute("value");
		System.out.println(lastname1);

		driver.quit();

	}

}
