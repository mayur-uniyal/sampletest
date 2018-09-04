package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Booking {
	
	@Test
	public void sample()  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");	
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://cheapticket.in/b2c/flights");
		WebElement signup=driver.findElement(By.id("signup"));
		signup.click();
		Thread.sleep(2000);
		System.out.println("We are ready for SignUP");
		WebElement email = driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@name='email']"));
		email.sendKeys("mayur.uniyal4@gmail.com");
		System.out.println("email");
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@name='mobile']"));
		mobile.sendKeys("8087181403");
		System.out.println("mobile");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@name='name']"));
		name.sendKeys("Mayur Uniyal");
		System.out.println("name");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@name='password']"));
		password.sendKeys("testing123");
		System.out.println("password");
		Thread.sleep(2000);
		WebElement passwordagain = driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//input[@name='password2']"));
		passwordagain.sendKeys("testing123");
		System.out.println("password again");
		Thread.sleep(2000);
		WebElement signupbutton=driver.findElement(By.xpath("//div[@class='ui basic segment inside_form']//button[@class='ui massive fluid blue button uppercase']"));
		signupbutton.click();
		System.out.println("SingUP Done");
}

}
