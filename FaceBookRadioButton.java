 package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookRadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABCD");
		driver.findElement(By.name("lastname")).sendKeys("XYZA");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7896541230");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("P@ssword08");
		WebElement day = driver.findElement(By.id("day"));
		Select dropdown = new Select(day);
		dropdown.selectByVisibleText("8");
		WebElement month = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(month);
		dropdown1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(year);
		dropdown2.selectByVisibleText("2000");
		driver.findElement(By.name("sex")).click();
	}

}
