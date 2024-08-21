package fourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyfourTestCase {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		driver.get("http://127.0.0.1:5500/anas.html");
	    driver.manage().window().maximize();
		
	}
	
	@Test
	public void myfourTest() {
		WebElement UserNameInput = driver.findElement(By.id("input1"));
		WebElement passowrdInput = driver.findElement(By.id("input2"));
		WebElement moblieNumber = driver.findElement(By.id("input3"));
		WebElement dateofBirth = driver.findElement(By.id("input4"));
		
		UserNameInput.sendKeys("Anas");
		passowrdInput.sendKeys("20250");
		moblieNumber.sendKeys("0792826795");
		dateofBirth.sendKeys("15/05/1989");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		submitButton.click();
		
	}

}
