package org.testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
 public static void main(String[]arms) throws InterruptedException {
	 System.setProperty("Webdriver.edge.drive", "C:\\Users\\lenovo\\eclipse-workspace\\org.testOne\\target\\driver\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 String url = "https://www.facebook.com/login/";
	 driver.get(url);
//	 driver.get("https://www.facebook.com/login/");
//	 driver.navigate().to("https://www.facebook.com/login/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 driver.navigate().back();      
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 
	 
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 
	 String UTRL = driver.getCurrentUrl();
	 System.out.println(UTRL);
	 if(url.equals(UTRL)) {
		 System.out.println("Correct url ");
		
	 }else {System.out.println("Wrong url");
	
	 
	 }
//	 driver.close();
//	 driver.quit();
	 
		 
//	 String tit = driver.getTitle();
//	 System.out.println(tit);
	 String pSource=driver.getPageSource();
	 System.out.println(pSource);
	
 }

}