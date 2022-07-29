package test1;
// Master
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	
		//Add Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\garim\\chromedriver.exe");
		
		//Initialize the Chrome Driver
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Ajit Vishwakarma");
		
		driver.findElement(By.name("btnK")).submit();
		

	}

}
