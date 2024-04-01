import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nmadishetti\\Eclipse new version\\DemoPoject\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\nmadishetti\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("niki1030@gmail.com");
        WebElement pwd=driver.findElement(By.name("pass"));
        pwd.sendKeys("123456");
        WebElement login=driver.findElement(By.name("login"));
        login.click();
        //driver.wait(2000);
        driver.quit();
	}

}
