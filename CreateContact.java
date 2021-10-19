package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("ABCX");
		driver.findElement(By.id("lastNameField")).sendKeys("YZX");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing");
		driver.findElement(By.name("primaryEmail")).sendKeys("tesr@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(state);
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click(); 
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println("Title is " +title);
	}

}
