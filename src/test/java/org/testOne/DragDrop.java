package org.testOne;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	

	public static void main(String[]args)throws Throwable{
		String alert = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		String dd = "https://demo.guru99.com/test/drag_drop.html";
		String fk = "https://www.naukri.com/registration/createAccount?othersrcp=22636";
//		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(fk);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\Documents\\Autoit.exe\\");
		
	
	
		
		
			
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.name("q")).sendKeys("RedMI mobiles",Keys.ENTER);
//		driver.findElement(By.xpath("(//div[@class='_4rR01T']) [1]")).click();
//		String amma=driver.getWindowHandle();
//		System.out.print(amma);
//		Set<String> son=driver.getWindowHandles();
//		System.out.print(son);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement drag =driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
//		WebElement drop =driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
//		Actions ad =new Actions(driver);
//		ad.dragAndDrop(drag, drop).perform();
//	}
//		WebElement name =driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
//		WebElement down = driver.findElement(By.xpath("//a[text()='Developers']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//       js.executeScript("arguments[0].setAttribute('value','Kingmaker')",name ,password, log);
////		Object oo =js.executeScript("return arguments[0].getAttribute('value')", name, password, log);
////		System.out.print(oo);
//		js.executeScript("arguments[2].click()", name, password,log);
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		Thread.sleep(4000);
//		js.executeScript("arguments[0].scrollIntoView(false)", name);
//       js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:Yellow')", name);
		
}
}