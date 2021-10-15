package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000EnyK");
		driver.manage().window().maximize();
		driver.findElement(By.name("UserFirstName")).sendKeys("ABCD");
		driver.findElement(By.name("UserLastName")).sendKeys("XYZ");
		driver.findElement(By.name("UserEmail")).sendKeys("testing@gmail.com");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select dropdown = new Select(title);
		dropdown.selectByVisibleText("CxO / General Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("AB Company"); 
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select dropdown1 = new Select(employee);
		dropdown1.selectByVisibleText("1 - 15 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("9874561230");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
		driver.close();
	}

}
