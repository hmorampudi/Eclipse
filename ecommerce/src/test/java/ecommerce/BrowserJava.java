package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserJava {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\JavaProjects\\ecommerce\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\ecommerce\\drivers\\chromedriver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String tit=driver.getTitle();
		System.out.println(tit);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		button.click();
	String Actualtitle=	driver.getTitle();
	String Expectedtitle="OrangeHRM";

	if(Actualtitle.equals(Expectedtitle))
	{
		System.out.println("title Matched");
	}
	else
	{
		System.out.println("Title not Matched");
	}
		
		driver.close();

	}

}
