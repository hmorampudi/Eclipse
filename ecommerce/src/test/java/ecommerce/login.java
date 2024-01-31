package ecommerce;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProjects\\ecommerce\\drivers\\chromedriver\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.google.co.uk/");
            driver.manage().window().maximize();
          String Title=driver.getTitle();
          System.out.println(Title);
	}

}
